package demo.beanvalidation;

import javax.validation.Validation;

import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

public class TestService {

	public static void main(String[] args) {
		PersonService personService = new PersonService();
		MethodValidationPostProcessor processor = new MethodValidationPostProcessor();
		processor.setValidatorFactory(Validation.buildDefaultValidatorFactory());
		personService = (PersonService)processor.postProcessAfterInitialization(personService, "");
		processor.afterPropertiesSet();
		// 
		personService.add(null, 12);
	}

}
