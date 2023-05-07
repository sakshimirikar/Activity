
package threads;

public class TestGarbageCollector {
	
	public void finalize() {
		System.out.println("All Objects are garbage collected");
	}

	public static void main(String[] args) {
		
		TestGarbageCollector t1 = new TestGarbageCollector();
		TestGarbageCollector t2 = new TestGarbageCollector();
		TestGarbageCollector t3 = new TestGarbageCollector();
		
		
		t1=null; //setting it as null or null referenced
		t2=null;
		t3=null;
		
		System.gc();
		System.out.println(" All are unreferenced ");
		
	}

}
