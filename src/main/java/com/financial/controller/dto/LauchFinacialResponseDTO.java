package com.financial.controller.dto;

import java.math.BigDecimal;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.financial.domain.enums.InputType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data
public class LauchFinacialResponseDTO {

	private Long id;
	private String description;
	private BigDecimal lauch;
	@Enumerated(EnumType.STRING)
	private InputType inputType;
}
