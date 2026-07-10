package multi;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest implements Callable<Integer> {//callable contain generic
	//callable is a interface
	//we can call by cal(0)method
	//callable contain generic

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return 123;
	}
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es=Executors.newSingleThreadExecutor();//single thread -1task
		//CallableTest ct=new CallableTest(); we write object but in this case we can call below line
		Future<Integer> fut=es.submit(new CallableTest());//task
		System.out.println(fut.get());
		es.shutdown();
		
	
	}

}
