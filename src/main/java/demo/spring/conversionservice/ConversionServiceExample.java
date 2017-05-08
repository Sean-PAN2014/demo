package demo.spring.conversionservice;

import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;

public class ConversionServiceExample {
	
	public static void main(String[] args) {
		ConversionService conversionService = DefaultConversionService.getSharedInstance();
		int result = conversionService.convert("123", int.class);
		// 
		System.out.println(result);
	}
	
}
