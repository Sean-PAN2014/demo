package demo.jsr349.validator;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PersonForm {

	@NotNull
	@Size(max = 64)
	private String name;

	@Min(0)
	private int age;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PersonForm [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}