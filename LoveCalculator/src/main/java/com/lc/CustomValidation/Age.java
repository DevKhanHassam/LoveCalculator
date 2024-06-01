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

@Constraint(validatedBy = AgeLogic.class )
public @interface Age {

String message() default "You must 18+";
	
	

	
	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}


