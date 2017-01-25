package demo.collection.transform;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;

import com.google.common.collect.Lists;

import demo.util.vo.Person;

public class ApacheTransform {

	public static void main(String[] args) throws Exception {
		List<Object> objects = Lists.newArrayList("Andy", "Bob");
		CollectionUtils.transform(objects, name -> new Person((String) name, 12));

		System.out.println(objects);
		// 设置所有age到20
		for (Object person : objects) {
			((Person) person).setAge(20);
		}
		System.out.println(objects);
	}

}
