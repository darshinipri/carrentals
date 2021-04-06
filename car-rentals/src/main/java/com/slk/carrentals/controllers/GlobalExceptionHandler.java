package com.slk.carrentals.controllers;

import org.springframework.web.bind.annotation.ExceptionHandler;

import com.slk.carrentals.dto.ResponseDto;

public class GlobalExceptionHandler {

	@ExceptionHandler()
	ResponseDto handler(Exception e) {
		ResponseDto response = new ResponseDto();
		response.setError(true);
		response.setResponse(e.getMessage());
		return response;
	}

}
