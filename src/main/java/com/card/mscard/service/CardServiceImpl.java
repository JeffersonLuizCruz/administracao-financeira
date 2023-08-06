package com.card.mscard.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.card.mscard.entity.Card;
import com.card.mscard.repository.CardRepository;

@Service
public class CardServiceImpl implements CardService{

	@Autowired private CardRepository cardRepository;
	
	@Override
	public Card save(Card card) {
		return cardRepository.save(card);
	}

	@Override
	public List<Card> findByIncome(Long renda) {
		BigDecimal resultRenda = BigDecimal.valueOf(renda);
		return cardRepository.findByIncomeLessThanEqual(resultRenda);
	}

}
