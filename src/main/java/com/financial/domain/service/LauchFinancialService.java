package com.financial.domain.service;

import java.util.List;

import com.financial.domain.model.LauchFinacial;

public interface LauchFinancialService {

	LauchFinacial save(LauchFinacial lauchFinacial);
	LauchFinacial update(Long id, LauchFinacial lauchFinacial);
	List<LauchFinacial> findAll();
	LauchFinacial findById(Long id);
	void deleteById(Long id);
}
