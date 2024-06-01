package com.lc.CustomValidation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AgeLogic implements ConstraintValidator<Age, Integer> {

	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context)

	{
		try {
		
			
			if ( value== 0 || value < 18) {
				return false;
			}

			else if (value > 99) {
				context.disableDefaultConstraintViolation();
				context.buildConstraintViolationWithTemplate("You must be less than 100 years old")
						.addConstraintViolation();

				return false;
			}
			return true;
		}

		catch (Exception e) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate("Enter Age").addConstraintViolation();

			return false;

		}

	}

}
