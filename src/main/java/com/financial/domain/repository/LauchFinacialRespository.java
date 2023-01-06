package com.financial.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.financial.domain.model.LauchFinacial;

@Repository
public interface LauchFinacialRespository extends JpaRepository<LauchFinacial, Long>{

}
