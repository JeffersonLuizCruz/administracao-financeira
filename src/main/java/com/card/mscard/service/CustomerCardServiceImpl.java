package com.card.mscard.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.card.mscard.entity.CustomerCard;
import com.card.mscard.entity.CustomerCardResponse;
import com.card.mscard.repository.CustomerCardRepository;

@Service
public class CustomerCardServiceImpl implements CustomerCardService{

	@Autowired private CustomerCardRepository customerRepository;
	
	
	@Override
	public List<CustomerCardResponse> findByCardCpf(String cpf) {
		List<CustomerCard> listcc = customerRepository.findByCpf(cpf);
		
		List<CustomerCardResponse> response = listcc.stream().map(cc -> {
			CustomerCardResponse ccr = new CustomerCardResponse();
			ccr.setName(cc.getCard().getName());
			ccr.setFlag(cc.getCard().getFlagCard().toString());
			ccr.setLimitApproved(cc.getBasicLimit());
			return ccr;
		}).collect(Collectors.toList());
		
		return response;
	}

}
