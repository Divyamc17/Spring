package com.xworkz.patient.repository;

import java.util.List;
import java.util.Optional;

import com.xworkz.patient.entity.PatientEntity;

public interface PatientRepository {

	boolean save(PatientEntity entity);

	default Optional<List<PatientEntity>> findByQuery(String query) {
		return Optional.empty();
	}

	default Optional<List<PatientEntity>> findByName(String name, int greaterThanAge, int lesserThanAge) {
		return Optional.empty();
	}
	

	List<PatientEntity> findByEmail(String email);

	List<PatientEntity> findByMobileNo(long mobileNo);

}
