package demo.jdeferred;

import org.jdeferred.AlwaysCallback;
import org.jdeferred.Deferred;
import org.jdeferred.DoneCallback;
import org.jdeferred.FailCallback;
import org.jdeferred.ProgressCallback;
import org.jdeferred.Promise;
import org.jdeferred.Promise.State;
import org.jdeferred.impl.DeferredObject;

public class DeferredTest {

	public static void main(String[] args) {
		Deferred<String, String, String> deferred = new DeferredObject<String, String, String>();
		Promise<String, String, String> promise = deferred.promise();
		promise.done(new DoneCallback<String>() {
			public void onDone(String result) {
				System.out.println(result);
			}
		}).fail(new FailCallback<String>() {
			public void onFail(String rejection) {
				System.out.println(rejection);
			}
		}).progress(new ProgressCallback<String>() {
			public void onProgress(String progress) {
				System.out.println(progress);
			}
		}).always(new AlwaysCallback<String, String>() {
			public void onAlways(State state, String result, String rejection) {
				System.out.println(state);
			}
		});

		deferred.notify("1001%");
		deferred.reject("oops");
		deferred.resolve("done");
	}

}
