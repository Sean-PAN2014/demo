package demo.completefuture;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.CompletableFuture;

public class Case2 {
	
	static void completedFutureExample() {
	    CompletableFuture<String> cf = CompletableFuture.completedFuture("message");
	    cf.handle((r, t) -> r);
	    assertTrue(cf.isDone());
	    assertEquals("message", cf.getNow(null));
	    assertEquals("message", cf.join());
	}
	
	public static void main(String[] args) {
		completedFutureExample();
	}
	
}

