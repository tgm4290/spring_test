package com.tgm.spring_test.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tgm.spring_test.model.Account;
import com.tgm.spring_test.repo.AccountRepository;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	private final AccountRepository accountRepository;

	@Autowired
	AccountController(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}
	
	@GetMapping
	Collection<Account> readAccounts()
	{
		return this.accountRepository.findAll();
	}
	
	@PostMapping
	ResponseEntity<?> add(@RequestBody Account account){
		Account accountResponse = accountRepository.save(account);
		return ResponseEntity.ok(accountResponse);
	}
}
