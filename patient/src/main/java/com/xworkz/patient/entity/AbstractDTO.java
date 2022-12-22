package com.xworkz.patient.entity;

import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MappedSuperclass
public class AbstractDTO {

	
	private String createdBy;
	private LocalDateTime localDateTime;
}
