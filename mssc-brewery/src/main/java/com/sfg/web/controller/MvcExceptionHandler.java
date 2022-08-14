package com.sfg.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MvcExceptionHandler {
	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<List> validationErrorHandler(ConstraintViolationException e)
	{
		List<String> errors=new ArrayList<>(e.getConstraintViolations().size());
		e.getConstraintViolations().forEach(constraintviolation->{
			errors.add(constraintviolation.getPropertyPath()+":"+constraintviolation.getMessage());
		});
		return new ResponseEntity<>(errors,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(BindException.class)
	public ResponseEntity<List> handleBindException(BindException exception)
	{
		return new ResponseEntity(exception.getAllErrors(),HttpStatus.BAD_REQUEST);
	}

}
