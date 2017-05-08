package demo.spring.typedescriptor;

import java.lang.reflect.Constructor;

import org.springframework.core.MethodParameter;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.util.ClassUtils;

import demo.util.bo.Person;

public class TypeDescriptorExample {

	public static void main(String[] args) throws Exception {
		Constructor<Person> constructor = ClassUtils.getConstructorIfAvailable(Person.class, String.class, int.class);
		MethodParameter methodParameter = MethodParameter.forMethodOrConstructor(constructor, 1);
		TypeDescriptor typeDescriptor = new TypeDescriptor(methodParameter);
		// 
		System.out.println(typeDescriptor);
		System.out.println(typeDescriptor.getResolvableType());
	}

}
