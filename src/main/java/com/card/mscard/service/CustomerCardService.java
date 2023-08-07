package com.card.mscard.service;

import java.util.List;

import com.card.mscard.entity.Card;

public interface CustomerCardService {

	List<Card> findByCpf(String cpf);
}
