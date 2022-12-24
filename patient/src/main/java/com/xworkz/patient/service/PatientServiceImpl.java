package com.xworkz.patient.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.patient.entity.PatientEntity;
import com.xworkz.patient.repository.PatientRepository;

@Component
public class PatientServiceImpl implements PatientService {
	@Autowired
	private PatientRepository repo;

	@Override
	public String validateAndSave(PatientEntity entity) {
		String message = "";
		System.out.println("patient in PatientServiceImpl");
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<PatientEntity>> valid = validator.validate(entity);
		if (valid.size() > 0) {
			System.out.println("size is fixed");
		} else {
			System.out.println("validated");
			boolean email = this.findByEmail(entity.getEmail());
			boolean mobile = this.findByMobileNo(entity.getMobileNo());
			if (email && mobile) {
				entity.setCreatedBy(entity.getName());
				entity.setLocalDateTime(LocalDateTime.now());
				boolean saved = this.repo.save(entity);
				if (saved) {
					message = "success";
				} else {
					message = "failed";
				}
			}
		}

		return message;
	}

	@Override
	public Optional<List<PatientEntity>> findByName(String name, int greaterThanAge, int lesserThanAge) {
		StringBuilder query = new StringBuilder("select patient from PatientEntity patient where  1=1");
		List<String> option = new ArrayList<String>();
		if (name != null && !name.isEmpty()) {
			query.append(" and patient.name like '%").append(name).append("%'");
			option.add(name);
		}
		if (greaterThanAge >= 0) {
			query.append(" and patient.age>=").append(greaterThanAge);
		}
		if (lesserThanAge > 0 && lesserThanAge <= 200) {
			query.append(" and patient.age<=").append(lesserThanAge);
		}
		System.out.println("Query Generated..." + query);
		return this.repo.findByQuery(query.toString());
	}

	

	@Override
	public boolean findByEmail(String email) {
		List<PatientEntity> findByEmail = repo.findByEmail(email);
		if (findByEmail != null) {
			return false;
		} else {
			return true;
		}

	}

	@Override
	public boolean findByMobileNo(long mobileNo) {
		List<PatientEntity> findByMobileNo = repo.findByMobileNo(mobileNo);
		if (findByMobileNo != null) {
			return false;
		} else {
			return true;
		}

	}
}
