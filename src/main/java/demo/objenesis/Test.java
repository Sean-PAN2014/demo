package demo.objenesis;

import org.objenesis.Objenesis;
import org.objenesis.ObjenesisStd;

import demo.util.bo.Person;

public class Test {
	
	public static void main(String[] args) throws Exception {
		Objenesis objenesis = new ObjenesisStd();
		Person person = objenesis.newInstance(Person.class);
		System.out.println(person);
	}

}
