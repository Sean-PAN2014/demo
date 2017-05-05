package demo.collection.transform;

import java.util.List;
import java.util.stream.Collectors;

import com.google.common.collect.Lists;

import demo.util.bo.Person;

public class JdkStream {

	public static void main(String[] args) throws Exception {
		List<String> names = Lists.newArrayList("Andy", "Bob");
		List<Person> persons = names.stream().map(name -> new Person(name, 12)).collect(Collectors.toList());
		System.out.println(persons);
		// 设置所有age到20
		for (Person person : persons) {
			person.setAge(20);
		}
		System.out.println(persons);
	}

}
