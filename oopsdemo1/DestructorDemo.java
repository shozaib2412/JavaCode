package oopsdemo1;

/**
 * Author  : Shozaib.Zulfiqar
 * Date    : Sep 3, 2025
 * Time    : 3:07:34 PM
 * Project : CoreJava
 */

class Test{

	//destructor 
	public void finalize() {
		System.out.println("Object Destroyed & Garbage Collected");
	}

}

public class DestructorDemo {
	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		Test t4 = new Test();

		t1 = null;
		t2 = null;
		t3 = null;
		//		t4 = null;

		System.gc();
		System.out.println("In main Method");
	}
}
