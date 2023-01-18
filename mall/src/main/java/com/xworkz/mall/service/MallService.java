package com.xworkz.mall.service;

import com.xworkz.mall.entity.AdminEntity;

public interface MallService {

	//boolean valiadteAndSave(AdminEntity entity);

	AdminEntity findByAdminNameAndpassword(String adminName, String password);

	default boolean sendMail(String email, String password) {
		return true;

	}

	AdminEntity findByName(String adminName);

	AdminEntity updatePasswordByGeneratedPassword(String generatedPassword, String password);

	AdminEntity findByMallName(String name);

	AdminEntity updateAccountUnlockByName(String name, String accountLocked);
}