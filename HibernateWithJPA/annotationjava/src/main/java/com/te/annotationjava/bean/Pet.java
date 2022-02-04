package com.te.annotationjava.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.te.annotationjava.interfaces.Animal;

import lombok.Data;

@Data
public class Pet implements Serializable{
	private String p_name;
	@Autowired
	@Qualifier("cat")
	private Animal animal;
	
}
