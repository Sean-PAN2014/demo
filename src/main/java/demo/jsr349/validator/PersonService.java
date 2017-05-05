package demo.jsr349.validator;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class PersonService {

	public void add(@NotNull String name, @Min(value = 0) int age) {

	}

}
