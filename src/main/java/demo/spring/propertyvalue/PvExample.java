package demo.spring.propertyvalue;

import java.util.List;

import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyValue;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import demo.util.bo.Address;
import demo.util.bo.Person;

public class PvExample {

	public static void main(String[] args) {
		PropertyValue agePv = new PropertyValue("age", "50");
		PropertyValue addressPv = new PropertyValue("address.city", "Dalian");
		PropertyValue nickNamesPv = new PropertyValue("nickNames", "Xy, xiaoEn");
		PropertyValue phoneNumberMapPv = new PropertyValue("phoneNumberMap", ImmutableMap.of("Home", "123"));
		// 
		Person p = new Person("Sean", 10, new Address("Beijing"), Lists.newArrayList(), Maps.newHashMap());
		BeanWrapperImpl wrapper = new BeanWrapperImpl(p);
		System.out.println(wrapper.getDefaultEditor(List.class));
		wrapper.setPropertyValue(agePv);
		wrapper.setPropertyValue(addressPv);
		wrapper.setPropertyValue(nickNamesPv);
		wrapper.setPropertyValue(phoneNumberMapPv);
		// 
		System.out.println(p);
	}

}
