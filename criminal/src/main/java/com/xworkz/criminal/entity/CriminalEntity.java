package com.xworkz.criminal.entity;

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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CriminalEntity")
@NamedQuery(name = "findByNameOrjailName", query = "select jail from CriminalEntity jail where jail.name=:nm or jail.jailName=:jn")
public class CriminalEntity extends AbstractEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String crime;
	private int awarded;
	private String aliasName;
	private String description;
	private String jailName;
	private String fileName;
	private long fileSize;
	private String contentType;
	private String fileType;

	public CriminalEntity(String name, String crime, int awarded, String aliasName, String description, String jailName,
			String fileName, long fileSize, String contentType, String fileType) {
		super();
		this.name = name;
		this.crime = crime;
		this.awarded = awarded;
		this.aliasName = aliasName;
		this.description = description;
		this.jailName = jailName;
		this.fileName = fileName;
		this.fileSize = fileSize;
		this.contentType = contentType;
		this.fileType = fileType;
	}

}
