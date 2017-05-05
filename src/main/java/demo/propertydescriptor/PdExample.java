package demo.propertydescriptor;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;

import demo.util.bo.Person;

public class PdExample {

	public static void main(String[] args) throws IntrospectionException {
		PropertyDescriptor pd = new PropertyDescriptor("name", Person.class);
		System.out.println(pd);
	}

}
