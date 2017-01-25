package demo.lazy.init;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

public class LazyInit {

	public static void main(String[] args) throws Exception {
		Supplier<String> supplier = Suppliers.memoize(() -> supply());
		System.out.println(supplier.get());
		System.out.println(supplier.get());
		System.out.println(supplier.get());
	}

	public static String supply() {
		System.out.println("called supply");
		return "Hello World";
	}

}
