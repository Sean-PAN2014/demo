package demo.junit.parameters;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class JunitParametersTest {
	
	@Test
	@Parameters({ 
			"17, false", 
			"22, true" 
		})
	public void personIsAdult(int age, boolean valid) throws Exception {
		System.out.println(age);
		System.out.println(valid);
	}
	
}
