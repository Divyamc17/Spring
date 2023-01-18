package com.xworkz.mall.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AbstractEntity {
	
   private String createdBy;
   private LocalDateTime createdByDate=LocalDateTime.now();
   private String updatedBy;
   private LocalDateTime updatedByDate=LocalDateTime.now();
   
}
