package demo.spring.data.jpa;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom {
	@Autowired
	private DataSource dataSource;

	public void someCustomMethod(Customer customer) {
		System.out.println(dataSource);
	}
	
}