package com.tgm.spring_test.exception;

@SuppressWarnings("serial")
public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(String userId){
		super("could not find user '" + userId + "'.");
	}
}
