package hierarchical;

public class D extends A{
	public void methodD() {
		System.out.println("method of class D");
	}
	
	public static void main(String args[]) {
		B obj1 = new B();
	    C obj2 = new C();
	    D obj3 = new D();
	    
	    obj1.methodA();
	    obj2.methodA();
	    obj3.methodA();
	}
}
