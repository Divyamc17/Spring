package com.xworkz.patient.entity;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AbstractDTO {

	
	private String createdBy;
	private LocalDateTime localDateTime;
}
