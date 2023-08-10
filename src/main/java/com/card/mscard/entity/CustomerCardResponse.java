package com.card.mscard.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class CustomerCardResponse implements Serializable{
	private static final long serialVersionUID = 804082772588142396L;

	private String name;
	private String flag;
	private BigDecimal limitApproved;
}
