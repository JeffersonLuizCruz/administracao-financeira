package com.card.mscard.service;

import java.util.List;

import com.card.mscard.entity.CustomerCard;

public interface CustomerCardService {

	List<CustomerCard> findByCpf(String cpf);
}
