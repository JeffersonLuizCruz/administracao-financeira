package com.financial.controller.mapper;

import org.mapstruct.Mapper;

import com.financial.controller.dto.LauchFinacialDTO;
import com.financial.controller.dto.LauchFinacialResponseDTO;
import com.financial.domain.model.LauchFinacial;

@Mapper(componentModel = "spring")
public interface LauchMapper {
	
	LauchFinacial toModel(LauchFinacialDTO dto);
	LauchFinacialResponseDTO toDTO(LauchFinacial lauchFinacial);

}
