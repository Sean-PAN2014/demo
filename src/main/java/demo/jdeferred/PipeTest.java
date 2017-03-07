package demo.jdeferred;

import org.jdeferred.Deferred;
import org.jdeferred.DonePipe;
import org.jdeferred.Promise;
import org.jdeferred.impl.DeferredObject;

public class PipeTest {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Deferred d = new DeferredObject();
		Promise p = d.promise();

		p.then(new DonePipe<Integer, Integer, Exception, Void>() {
			public Deferred<Integer, Exception, Void> pipeDone(Integer result) {
				if (result < 100) {
					return new DeferredObject<Integer, Exception, Void>().resolve(result);
				} else {
					return new DeferredObject<Integer, Exception, Void>().reject(new Exception("123"));
				}
			}
		}).done(System.out::println).fail(System.out::println);

		d.resolve(80);
		d.resolve(1000);
	}

}
