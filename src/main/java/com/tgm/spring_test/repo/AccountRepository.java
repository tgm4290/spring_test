package com.tgm.spring_test.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tgm.spring_test.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
	public Optional<Account> findByUserName(String userName);
	
}
