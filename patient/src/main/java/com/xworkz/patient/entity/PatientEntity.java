package com.xworkz.patient.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PatientEntity")
//SELECT * from patiententity where name='divya' or age>20 and age<50;
@NamedQuery(name = "findByNameOrAgeGreatherThanOrAgeLesserThan", query = "select patient from PatientEntity patient where patient.name=:nm or (patient.age >=:ag and patient.age<=:ae)")
@NamedQuery(name = "findByEmail", query = "select patient from PatientEntity patient where patient.email=:em")
@NamedQuery(name = "findByEmail", query = "select patient from PatientEntity patient where patient.mobileNo=:mb")
public class PatientEntity extends AbstractDTO{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotNull
	@NotEmpty
	private String name;
	@Column(name = "email", unique=true)
	private String email;
	private int age;
	private long mobileNo;
	private String gender;
	private String idCard;
	private boolean bplCard;
	private boolean insurence;

	public PatientEntity(String name, String email, int age, long mobileNo, String gender, String idCard,
			boolean bplCard, boolean insurence) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.idCard = idCard;
		this.bplCard = bplCard;
		this.insurence = insurence;
	}

}
