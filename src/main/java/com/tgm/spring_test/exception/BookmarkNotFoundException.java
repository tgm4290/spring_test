package com.tgm.spring_test.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BookmarkNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4587666665796489741L;

	public BookmarkNotFoundException(Long bookmarkId){
		super("Could not find bookmark '" + bookmarkId + "'.");
	}
}
