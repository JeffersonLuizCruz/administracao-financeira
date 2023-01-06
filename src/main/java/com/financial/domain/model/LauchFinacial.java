package com.financial.domain.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import com.financial.domain.enums.InputType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @AllArgsConstructor @NoArgsConstructor @Data
public class LauchFinacial implements Serializable{
	private static final long serialVersionUID = 3989249856700651289L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String description;
	private BigDecimal lauch;
	@Enumerated(EnumType.STRING)
	private InputType inputType;
	
	@CreationTimestamp  @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	@Column(nullable = false, columnDefinition = "datetime")
	private LocalDateTime createAt;
	
	@UpdateTimestamp  @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	@Column(nullable = false, columnDefinition = "datetime")
	private LocalDateTime updateAt;
}
