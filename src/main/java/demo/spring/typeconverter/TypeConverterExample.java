package demo.spring.typeconverter;

import org.springframework.beans.SimpleTypeConverter;

public class TypeConverterExample {
	
	public static void main(String[] args) {
//		PropertyEditorRegistrySupport support = new PropertyEditorRegistrySupport();
//		PropertyEditor propertyEditor = support.getDefaultEditor(int.class);
//		System.out.println(propertyEditor);
		
		SimpleTypeConverter typeConverter = new SimpleTypeConverter();
		Integer integer = typeConverter.convertIfNecessary("123", int.class);
		System.out.println(integer);
	}
	
}
