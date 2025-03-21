package com.lc.CustomValidation;

import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Retention(RetentionPolicy.RUNTIME) 
@Target(ElementType.FIELD)

@Constraint(validatedBy = NameValidation.class )
public @interface Name {

	
	String message() default "Name must be between 3 to 25 characters";



	
	//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//	just copy below code from any validation
//	!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	
	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
