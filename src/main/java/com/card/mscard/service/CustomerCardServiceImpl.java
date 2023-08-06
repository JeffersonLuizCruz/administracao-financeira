package com.card.mscard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.card.mscard.entity.CustomerCard;
import com.card.mscard.repository.CustomerCardRepository;

@Service
public class CustomerCardServiceImpl implements CustomerCardService{

	@Autowired private CustomerCardRepository customerRepository;
	
	@Override
	public List<CustomerCard> findByCpf(String cpf) {
		return customerRepository.findByCpf(cpf);
	}

}
