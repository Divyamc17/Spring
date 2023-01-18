package com.xworkz.mall.service;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Properties;
import java.util.Random;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.mall.entity.AdminEntity;
import com.xworkz.mall.repository.MallRepository;

@Component
public class MallServiceImpl implements MallService {

	@Autowired
	private MallRepository repository;
	int countFirstLogin = 0;
	int loginCount = 0;

	@Override
	public AdminEntity findByAdminNameAndpassword(String adminName, String password) {
		AdminEntity findByAdminNameAndpassword = repository.findByAdminNameAndpassword(adminName,encryption(password, 8) );

		if (findByAdminNameAndpassword != null) {
			loginCount++;
			findByAdminNameAndpassword.setLoginCount(loginCount);
			System.out.println(findByAdminNameAndpassword.getLoginCount());
			repository.updateLoginCountByAdminName(adminName, findByAdminNameAndpassword.getLoginCount());
			if (findByAdminNameAndpassword.getFirstLogin() < 1) {
				countFirstLogin++;
				System.out.println(countFirstLogin);
				findByAdminNameAndpassword.setFirstLogin(countFirstLogin);
				
				repository.updatefirstLoginByName(adminName, findByAdminNameAndpassword.getFirstLogin());
				System.out.println(findByAdminNameAndpassword);
				System.out.println("entering first login");

				findByAdminNameAndpassword.setGeneratedPassword(generatedPassword(8));
				System.out.println(generatedPassword(8));
				repository.updateGeneratedPasswordByName(adminName, findByAdminNameAndpassword.getGeneratedPassword());
				String mallEmail = findByAdminNameAndpassword.getMallEmail();
				String generatedPassword = findByAdminNameAndpassword.getGeneratedPassword();
				sendMail(mallEmail, generatedPassword);
				return findByAdminNameAndpassword;
			}

			return findByAdminNameAndpassword;
		} else {
			int count1 = 0;
			AdminEntity findByName = repository.findByName(adminName);
			if (findByName != null) {
				count1 = findByName.getNoOfWrongAttempt();
				System.out.println("checking the count before++" + count1);
			}

			if (count1 < 3) {
				count1++;
				System.out.println("checking the count after++" + count1);
				System.out.println("update the wrong attempts");
				repository.updateNoOfWrongAttemptsByName(adminName, count1);
			}
			if (count1 >= 3) {
				System.out.println("count is greater then 3 than locking the account");
				findByName.setAccountLocked("Locked");
				repository.updateAccountLockedByName(adminName, findByName.getAccountLocked());

			}
			return null;
		}

	}

	@Override
	public boolean sendMail(String email, String passwordGenerated) {

		final String username = "DadaNimbalakar@outlook.com";
		final String password = "Dada@1993";

		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp-mail.outlook.com");
		properties.put("mail.smtp.port", "587");
// Session is class reprez
		Session session = Session.getInstance(properties, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);

			}
		});
		session.setDebug(true);

		try {
// Message is abstract class
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
			message.setSubject("Login Password");
			message.setText("This is Temporory Password for first time login please change the password" + "\n"
					+ passwordGenerated);
			Transport.send(message);

			System.out.println("Message Done");
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}

		return true;
	}

	public String generatedPassword(int length) {

		System.out.println("generate password");
		String[] ref = { "ABCDEFGHIJKLMNOPQRSTUVWXYZ", "abcdefghijklmnopqrstuvwxyz", "!@#$", "1234567890" };
		String combinedChars = ref[0] + ref[1] + ref[2] + ref[3];

		Random random = new Random();

		char[] password = new char[length];

		password[0] = ref[0].charAt(random.nextInt(ref[0].length()));
		password[1] = ref[1].charAt(random.nextInt(ref[1].length()));
		password[2] = ref[2].charAt(random.nextInt(ref[2].length()));
		password[3] = ref[3].charAt(random.nextInt(ref[3].length()));

		for (int i = 4; i < password.length; i++) {
			password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
		}
		System.out.println(password);
		String string = password.toString();

		return string;
	}

	@Override
	public AdminEntity findByName(String adminName) {

		return repository.findByName(adminName);
	}

	@Override
	public AdminEntity updatePasswordByGeneratedPassword(String generatedPassword, String password) {
		AdminEntity findByGeneratedPassword = repository.finfByGeneratedPassword(generatedPassword);
		if (findByGeneratedPassword.getLoginCount() > 1) {
			LocalTime time = findByGeneratedPassword.getTime();
			LocalTime now = LocalTime.now();
			findByGeneratedPassword.setGeneratedPasswordTime(now);
			repository.updateGeneratedPasswordTimeByGeneratedPassword(generatedPassword,
					findByGeneratedPassword.getGeneratedPasswordTime());
			System.out.println(now);
			Duration between = Duration.between(findByGeneratedPassword.getTime(),
					findByGeneratedPassword.getGeneratedPasswordTime());
			long minutes = between.toMinutes();
			if (minutes <= 1) {
				if (findByGeneratedPassword.getAccountLocked().equals("locked")
						& findByGeneratedPassword.getNoOfWrongAttempt() < 4) {
					findByGeneratedPassword.setAccountLocked("Unlocked");
					findByGeneratedPassword.setNoOfWrongAttempt(0);
					repository.updateNoOfWrongAttemptsByMallName(findByGeneratedPassword.getMallEmail(),
							findByGeneratedPassword.getNoOfWrongAttempt());
					repository.updateAccountUnlockByName(findByGeneratedPassword.getMallEmail(),
							findByGeneratedPassword.getAccountLocked());
					return repository.updatePasswordByGeneratedPassword(generatedPassword, encryption(password, 8));

				}
			}

		} else {
			if (findByGeneratedPassword.getLoginCount() <= 1) {
				findByGeneratedPassword.setAccountLocked("unlocked");
				findByGeneratedPassword.setNoOfWrongAttempt(0);
				repository.updateNoOfWrongAttemptsByMallName(findByGeneratedPassword.getMallEmail(),
						findByGeneratedPassword.getNoOfWrongAttempt());
				repository.updateAccountUnlockByName(findByGeneratedPassword.getMallEmail(),
						findByGeneratedPassword.getAccountLocked());
				return repository.updatePasswordByGeneratedPassword(generatedPassword, encryption(password, 8));

			}
		}

		return null;

	}

	@Override
	public AdminEntity findByMallName(String name) {
		AdminEntity findByMallName = repository.findByMallName(name);
		if (findByMallName != null) {
			findByMallName.setGeneratedPassword(generatedPassword(8));
			LocalTime now2 = LocalTime.now();
			findByMallName.setTime(now2);
			System.out.println(now2);
			repository.updateTimeByMall(name, findByMallName.getTime());
			repository.updateGeneratedPasswordByMallName(name, findByMallName.getGeneratedPassword());
			sendMail(findByMallName.getMallEmail(), findByMallName.getGeneratedPassword());
		}
		return findByMallName;
	}

	public static String encryption(String value, int secretKey) {
		String encrypt = "";
		for (int i = 0; i < value.length(); i++) {
			char ch = value.charAt(i);
			ch += secretKey;
			encrypt = encrypt + ch;
		}
		return encrypt;
	}

	public static String decryption(String encrypt, int secretKey) {
		String decrypt = "";
		for (int i = 0; i <= encrypt.length(); i++) {
			char ch = encrypt.charAt(i);
			ch -= secretKey;
			decrypt = decrypt + ch;
		}

		return decrypt;
	}

//	@Override
//	public boolean valiadteAndSave(AdminEntity entity) {
//		// TODO Auto-generated method stub
//		return false;
//	}

	@Override
	public AdminEntity updateAccountUnlockByName(String name, String accountLocked) {
		// TODO Auto-generated method stub
		return null;
	}

}
