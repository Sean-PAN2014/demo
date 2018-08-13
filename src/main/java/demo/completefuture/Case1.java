package demo.completefuture;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class Case1 {

	static void completeExceptionallyExample() {
		CompletableFuture<String> cf = CompletableFuture.completedFuture("message")//
			.thenApplyAsync(r -> {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
			});
		// 
		CompletableFuture<String> exceptionHandler = cf.handle((s, th) -> th != null ? "message upon cancel" : "");
		cf.completeExceptionally(new RuntimeException("completed exceptionally"));
		assertTrue("Was not completed exceptionally", cf.isCompletedExceptionally());
		try {
			cf.join();
			fail("Should have thrown an exception");
		} catch (CompletionException ex) { // just for testing
			assertEquals("completed exceptionally", ex.getCause().getMessage());
		}
		assertEquals("message upon cancel", exceptionHandler.join());
	}

	public static void main(String[] args) throws InterruptedException {
		completeExceptionallyExample();
	}

}
