package com.financial.controller.api;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.financial.controller.dto.LauchFinacialDTO;
import com.financial.controller.dto.LauchFinacialResponseDTO;
import com.financial.controller.mapper.LauchMapper;
import com.financial.domain.model.LauchFinacial;
import com.financial.domain.service.LauchFinancialService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/lauch")
@RequiredArgsConstructor
public class LauchFinacialController {

	private final LauchFinancialService lauchFinancialService;
	private final LauchMapper lauchMapper;
	
	@PostMapping
	public ResponseEntity<LauchFinacialResponseDTO> save(@RequestBody @Valid LauchFinacialDTO dto) {
		LauchFinacial modelLauch = lauchMapper.toModel(dto);
		LauchFinacial lauchEntity = lauchFinancialService.save(modelLauch);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(lauchMapper.toDTO(lauchEntity));
	}

}
