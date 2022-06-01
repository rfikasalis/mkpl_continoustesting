import src.main.java.Counter;

public class Driver {

	public static voids main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("nilai Count:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("nilai Count:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("nilai Count:" + counter.getCount());
		
	}

}
