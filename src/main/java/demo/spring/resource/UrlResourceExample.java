package demo.spring.resource;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.core.io.UrlResource;

public class UrlResourceExample {

	public static void main(String[] args) throws Exception {
		// 
		UrlResource resource = new UrlResource("http://www.baidu.com");
		System.out.println(resource.isOpen());
		System.out.println(resource.isReadable());
		System.out.println(resource.getInputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(resource.getInputStream()));
		String readLine = null;
		while (((readLine = br.readLine()) != null)) {
			System.out.println(readLine);
		}
	}

}
