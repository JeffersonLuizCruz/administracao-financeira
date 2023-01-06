package com.financial.controller.dto;

import java.math.BigDecimal;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;

import com.financial.domain.enums.InputType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data
public class LauchFinacialDTO {

	@NotBlank(message = "Descrição é um campo obrigatório!")
	private String description;
	
	@NotBlank(message = "Valor é um campo obrigatório!")
	private BigDecimal input;
	
	@NotBlank(message = "O tipo do lançamento é obrigatório!")
	@Enumerated(EnumType.STRING)
	private InputType inputType;
	
}
