package demo.jdeferred;

import org.jdeferred.Deferred;
import org.jdeferred.DoneCallback;
import org.jdeferred.DoneFilter;
import org.jdeferred.Promise;
import org.jdeferred.impl.DeferredObject;

public class FilterTest {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Deferred d = new DeferredObject();
		Promise p = d.promise();
		Promise filtered = p.then(new DoneFilter<Integer, Integer>() {
		  public Integer filterDone(Integer result){
		    return result * 10;
		  }
		});

		filtered.done(new DoneCallback<Integer>() {
		  public void onDone(Integer result) {
		    // result would be original * 10
		    System.out.println(result);
		  }
		});

		d.resolve(3);
	}

}
