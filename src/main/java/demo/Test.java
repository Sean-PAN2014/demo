package demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) throws Exception {
		// 
		Process p = Runtime.getRuntime().exec("C:/Program Files/Java/jdk1.8.0_91/bin/java");
		BufferedReader input = new BufferedReader(new InputStreamReader(p.getErrorStream()));
		String line = null;
		while ((line = input.readLine()) != null) {
			System.out.println(line);
		}
		int exitVal = p.waitFor();
		System.out.println("Exited with error code " + exitVal);
	}

}
