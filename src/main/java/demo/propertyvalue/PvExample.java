package demo.propertyvalue;

import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyValue;

import com.google.common.collect.Lists;

import demo.util.vo.Address;
import demo.util.vo.Person;

public class PvExample {

	public static void main(String[] args) {
		PropertyValue agePv = new PropertyValue("age", "50");
		PropertyValue addressPv = new PropertyValue("address.city", "Dalian");
		PropertyValue phoneNumber1Pv = new PropertyValue("phoneNumbers", "111, 222");
		// 
		Person p = new Person("Sean", 10, new Address("Beijing"), Lists.newArrayList());
		BeanWrapperImpl wrapper = new BeanWrapperImpl(p);
		wrapper.setPropertyValue(agePv);
		wrapper.setPropertyValue(addressPv);
		wrapper.setPropertyValue(phoneNumber1Pv);
		// 
		System.out.println(p);
	}

}
