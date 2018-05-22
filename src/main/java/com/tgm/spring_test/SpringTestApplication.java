package com.tgm.spring_test;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tgm.spring_test.model.Account;
import com.tgm.spring_test.model.Bookmark;
import com.tgm.spring_test.repo.AccountRepository;
import com.tgm.spring_test.repo.BookmarkRepository;

@SpringBootApplication
public class SpringTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTestApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(AccountRepository accountRepository, BookmarkRepository bookmarkRepository){
		return (evt) -> Arrays.asList("tmeyer,jross".split(","))
				.forEach(a -> {
					System.out.println(a);
					Account account = accountRepository.save(new Account(a, "password"));
					bookmarkRepository.save(new Bookmark(account, "http://bookmark.com/1/" + a, "A description"));
					bookmarkRepository.save(new Bookmark(account, "http://bookmark.com/2/" + a, "A description"));
				});
	}
}
