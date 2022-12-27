package com.xworkz.criminal.entity;

import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MappedSuperclass
public class AbstractEntity {

	private String createdBy;
	private LocalDateTime localDateTime;

}
