package com.card.mscard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.card.mscard.entity.Card;
import com.card.mscard.entity.CustomerCard;

@Repository
public interface CustomerCardRepository extends JpaRepository<CustomerCard, Long>{

	List<Card> findByCpf(String cpf);
}
