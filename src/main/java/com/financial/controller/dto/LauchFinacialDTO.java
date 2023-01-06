package com.financial.controller.dto;

import java.math.BigDecimal;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

import com.financial.domain.enums.InputType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data
public class LauchFinacialDTO {

	@NotBlank(message = "Descrição é um campo obrigatório!")
	private String description;
	@NotNull(message = "Valor é um campo obrigatório!")
	@PositiveOrZero(message = "Valores apenas positivo!")
	private BigDecimal lauch;
	
	@NotNull(message = "Tipo do lançamento é obrigatório!")
	private InputType inputType;
	
}
