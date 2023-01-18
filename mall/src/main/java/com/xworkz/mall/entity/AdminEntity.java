package com.xworkz.mall.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "mall_admin")
@NamedQuery(name = "findByAdminNameAndpassword", query = "select mall from AdminEntity mall where mall.adminName=:nm and mall.password=:pd")
@NamedQuery(name = "updateNoOfWrongAttemptsByName", query = "update AdminEntity mall set mall.noOfWrongAttempt=:na where mall.adminName=:nm")
@NamedQuery(name = "findByName", query = "select mall from AdminEntity mall where mall.adminName=:nm")
@NamedQuery(name = "updatefirstLoginByName", query = "update AdminEntity mall set mall.firstLogin=:lg where mall.adminName=:nm")
@NamedQuery(name = "updateAccountLockedByName", query = "update AdminEntity mall set mall.accountLocked=:al where mall.adminName=:nm")
@NamedQuery(name = "updateGeneratedPasswordByName", query = "update AdminEntity mall set mall.generatedPassword=:gpas where mall.adminName=:nm")
@NamedQuery(name = "updatePasswordByGeneratedPassword", query = "update AdminEntity mall set mall.password=:ps where mall.generatedPassword=:gs")
@NamedQuery(name = "findByMallName", query = "select mall from AdminEntity mall where mall.name=:mn")
@NamedQuery(name = "updateGeneratedPasswordByMallName", query = "update AdminEntity mall set mall.generatedPassword=:gs where mall.name=:mn")
@NamedQuery(name = "updateLoginCountByAdminName", query = "update AdminEntity mall set mall.loginCount=:lc where mall.name=:nm")
@NamedQuery(name = "updateTimeByMallName", query = "update AdminEntity mall set mall.time=:ti where mall.name=:mn")
@NamedQuery(name = "updateAcountUnlockByName", query = "update AdminEntity mall set mall.accountLocked=:al where mall.name=:mn")
@NamedQuery(name = "updateNoOfWrongAttemptsByMallName", query = "update AdminEntity mall set mall.noOfWrongAttempt=:noof where mall.name=:mn")
@NamedQuery(name = "findByGeneratedPassword", query = "select mall from AdminEntity mall where mall.generatedPassword=:ps")
@NamedQuery(name = "updateGeneratedPasswordTimeByGeneratedPassword", query = "update AdminEntity mall set mall.generatedPasswordTime=:gpt where mall.generatedPassword=:gp")
public class AdminEntity extends AbstractEntity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "Mall_Name")
	private String name;
	@Column(name = "Admin_Name")
	private String adminName;
	@Column(name = "Password")
	private String password;
	@Column(name = "Active")
	private boolean active;
	@Column(name = "Account_Locked")
	private String accountLocked;
	@Column(name = "No_Of_Wrong_Attempts")
	private int noOfWrongAttempt;
	@Column(name = "Mall_Email")
	private String mallEmail;
	@Column(name="First_Login")
	private int firstLogin;
	@Column(name="GeneratedPassword")
	private String generatedPassword;
	@Column(name="Login_Count")
	private int loginCount;
	@Column(name="Time")
	private LocalTime time;
	@Column(name="GeneratedPasswordTime")
	private LocalTime generatedPasswordTime;

	public AdminEntity(String createdBy, LocalDateTime createdByDate, String updatedBy, LocalDateTime updatedByDate,
			String name, String adminName, String password, boolean active, String accountLocked, int noOfWrongAttempt,
			String mallEmail, int firstLogin, String generatedPassword, int loginCount, LocalTime time,
			LocalTime generatedPasswordTime) {
		super(createdBy, createdByDate, updatedBy, updatedByDate);
		this.name = name;
		this.adminName = adminName;
		this.password = password;
		this.active = active;
		this.accountLocked = accountLocked;
		this.noOfWrongAttempt = noOfWrongAttempt;
		this.mallEmail = mallEmail;
		this.firstLogin = firstLogin;
		this.generatedPassword = generatedPassword;
		this.loginCount = loginCount;
		this.time = time;
		this.generatedPasswordTime = generatedPasswordTime;
	}

}
