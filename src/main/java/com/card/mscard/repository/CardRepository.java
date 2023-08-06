package com.card.mscard.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.card.mscard.entity.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, Long>{

	List<Card> findByIncomeLessThanEqual(BigDecimal renda);

}
