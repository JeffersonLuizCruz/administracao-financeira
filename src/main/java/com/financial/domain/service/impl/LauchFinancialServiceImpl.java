package com.financial.domain.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.financial.domain.model.LauchFinacial;
import com.financial.domain.repository.LauchFinacialRespository;
import com.financial.domain.service.LauchFinancialService;

import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor
public class LauchFinancialServiceImpl implements LauchFinancialService{

	private final LauchFinacialRespository lauchFinancilRepository;
	
	
	@Override
	public LauchFinacial save(LauchFinacial lauchFinacial) {
		return lauchFinancilRepository.save(lauchFinacial);
	}

	@Override
	public LauchFinacial update(Long id, LauchFinacial lauchFinacial) {
		checkIfLauchFinancialExists(id);
		
		return lauchFinancilRepository.save(lauchFinacial);
	}

	@Override
	public List<LauchFinacial> findAll() {
		return lauchFinancilRepository.findAll();
	}

	@Override
	public LauchFinacial findById(Long id) {
		return checkIfLauchFinancialExists(id);
	}

	@Override
	public void deleteById(Long id) {
		checkIfLauchFinancialExists(id);
		lauchFinancilRepository.deleteById(id);
	}
	
	private LauchFinacial checkIfLauchFinancialExists(Long id) {
		return lauchFinancilRepository.findById(id)
		.orElseThrow(() -> new RuntimeException("TODO - user não existe"));
	}

}
