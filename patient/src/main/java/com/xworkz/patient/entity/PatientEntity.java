package com.xworkz.patient.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PatientEntity_db")
@NamedQuery(name = "findByNameOrAgeGreatherThanOrAgeLesserThan", query = "select patient from PatientEntity patient where patient.name=:nm or (patient.age >=:ag or patient.age<=:ae)")
@NamedQuery(name = "findByEmail", query = "select patient from PatientEntity patient where patient.email=:em")
@NamedQuery(name = "findByMobileNo", query = "select patient from PatientEntity patient where patient.mobileNo=:mb")
public class PatientEntity extends AbstractDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotNull
	@NotEmpty
	@Length(min = 3, max = 50, message = "name is valid")
	private String name;
	@Column(name = "email", unique = true)
	private String email;
	@Min(value = 0)
	@Max(value = 100)
	private int age;
	@Column(name = "mobileNo", unique = true)
	private long mobileNo;
	@NotNull
	@NotEmpty
	private String gender;
	@NotNull
	@NotEmpty
	private String idCard;
	@NotNull
	@NotEmpty
	private String idValue;
	private boolean bplCard;
	private boolean insurence;
	private long fileSize;
	private String contentType;
	private String fileType;
	private String fileName;

	public PatientEntity(@NotNull @NotEmpty @Length(min = 3, max = 50, message = "name is valid") String name,
			String email, @Min(0) @Max(100) int age, long mobileNo, @NotNull @NotEmpty String gender,
			@NotNull @NotEmpty String idCard, @NotNull @NotEmpty String idValue, boolean bplCard, boolean insurence,
			long fileSize, String contentType, String fileType, String fileName) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.idCard = idCard;
		this.idValue = idValue;
		this.bplCard = bplCard;
		this.insurence = insurence;
		this.fileSize = fileSize;
		this.contentType = contentType;
		this.fileType = fileType;
		this.fileName = fileName;
	}

}
