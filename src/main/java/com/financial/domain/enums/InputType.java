package com.financial.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter
public enum InputType {

	INPUT("input"), OUTPUT("output");
	
	private String description;
}
