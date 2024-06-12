package com.lc.CustomValidation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NameValidation implements ConstraintValidator<Name, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {

		if (value.length() >= 3 && value.length() <= 25) {
			
			if(value.trim().length()>=3)
			{
				return true;	
			}
			
		}

		return false;

	}
}
