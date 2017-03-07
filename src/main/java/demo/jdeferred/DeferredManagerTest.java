package demo.jdeferred;

import org.jdeferred.DeferredManager;
import org.jdeferred.impl.DefaultDeferredManager;
import org.jdeferred.multiple.MultipleResults;

public class DeferredManagerTest {

	public static void main(String[] args) {
		DeferredManager dm = new DefaultDeferredManager();
//		dm.when(() -> {
//			return "Hey!";
//		}).done(r -> System.out.println(r));

//		dm.when(DeferredManagerTest::task1, DeferredManagerTest::task2).done(DeferredManagerTest::done);
		
		dm.when(DeferredManagerTest::task1, DeferredManagerTest::task2)
		  .done(rs -> done(get(rs, 0), get(rs, 1)));
	}

	public static String task1() throws InterruptedException {
		Thread.sleep(1000);
		return "Hello";
	}

	public static String task2() throws InterruptedException {
		System.out.println("task2 World");
		return "World";
	}

	public static void done(MultipleResults rs) {
		System.out.println(rs.get(0).getResult());
		System.out.println(rs.get(1).getResult());
	}

	public static void done(String r1, String r2) {
		System.out.println(r1);
		System.out.println(r2);
	}

	@SuppressWarnings("unchecked")
	public static <T>  T get(MultipleResults rs, int index) {
		return (T) rs.get(index).getResult();
	}
	
}
