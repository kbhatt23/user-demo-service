package com.learning.userdemoservice.bean;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
//used when no controller advice exist and we want OOB exception handler to send specific status
@ResponseStatus(code = HttpStatus.NOT_FOUND )
public class UserException extends RuntimeException{

	public UserException(String message) {
		super(message);
	}
}
