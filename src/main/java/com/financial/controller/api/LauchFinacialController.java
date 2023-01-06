package com.financial.controller.api;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.financial.domain.model.LauchFinacial;
import com.financial.domain.service.LauchFinancialService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/lauch")
@RequiredArgsConstructor
public class LauchFinacialController {

	private final LauchFinancialService lauchFinancialService;
	
	public ResponseEntity<LauchFinacial> save(@RequestBody @Valid LauchFinacial lauchFinacial) {

		return ResponseEntity.status(HttpStatus.CREATED).body(new LauchFinacial());
	}

}
