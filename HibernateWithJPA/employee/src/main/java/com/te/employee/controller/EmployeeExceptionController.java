package com.te.employee.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.te.employee.exception.EmployeeException;

@ControllerAdvice
public class EmployeeExceptionController {
	
	@ExceptionHandler(EmployeeException.class)
	public String exceptionHandle(HttpServletRequest request,EmployeeException exception) {
		request.setAttribute("errMessage", exception.getMessage());
		return "login";
	}
}
