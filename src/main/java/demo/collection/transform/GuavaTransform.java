package demo.collection.transform;

import java.util.List;

import com.google.common.collect.Lists;

import demo.util.bo.Person;

public class GuavaTransform {

	public static void main(String[] args) throws Exception {
		List<String> names = Lists.newArrayList("Andy", "Bob");
		List<Person> persons = Lists.transform(names, name -> new Person(name, 12));
		System.out.println(persons);
		// 设置所有age到20
		for (Person person : persons) {
			person.setAge(20);
		}
		System.out.println(persons);
	}

}
