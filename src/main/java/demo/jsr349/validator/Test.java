package demo.jsr349.validator;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class Test {

	public static void main(String[] args) {
		PersonForm target = new PersonForm();
		target.setName("Sean");
		target.setAge(10);
		target.setName(null);
		// 
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		System.out.println(validator);
		Set<ConstraintViolation<PersonForm>> validate = validator.validate(target);
		System.out.println(validate);
	}

}
