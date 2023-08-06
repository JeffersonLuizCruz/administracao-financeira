package com.card.mscard.service;

import java.util.List;

import com.card.mscard.entity.Card;

public interface CardService {

	Card save(Card card);
	List<Card> findByIncome(Long id);
}
