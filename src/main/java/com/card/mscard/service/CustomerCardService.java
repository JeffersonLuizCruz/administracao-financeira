package com.card.mscard.service;

import java.util.List;

import com.card.mscard.entity.CustomerCardResponse;

public interface CustomerCardService {

	List<CustomerCardResponse> findByCardCpf(String cpf);
}
