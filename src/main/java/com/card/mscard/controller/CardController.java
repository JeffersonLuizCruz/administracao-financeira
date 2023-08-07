package com.card.mscard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.card.mscard.entity.Card;
import com.card.mscard.service.CardService;
import com.card.mscard.service.CustomerCardService;

@RestController
@RequestMapping("/cards")
public class CardController {

	@Autowired private CardService cardService;
	@Autowired private CustomerCardService customerCardService;
	
	@PostMapping
	public ResponseEntity<Card> save(@RequestBody Card card){
		return ResponseEntity.status(HttpStatus.CREATED).body(cardService.save(card));
	}
	
	@GetMapping(params = "renda")
	public ResponseEntity<List<Card>> findByIncome(@RequestParam("renda") Long renda){
		return ResponseEntity.status(HttpStatus.OK).body(cardService.findByIncome(renda));
	}
	
	@GetMapping(params = "cpf")
	public ResponseEntity<List<Card>> findByCardCpf(@RequestParam("cpf") String cpf){
		return ResponseEntity.status(HttpStatus.OK).body(customerCardService.findByCpf(cpf));
	}
	@GetMapping
	public String status() {
		return "Hello World";
	}
}
