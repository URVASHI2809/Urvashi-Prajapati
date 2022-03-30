class A extends B{
//	public static void m1() { -------------------------- it  will not supports in heritance & static is independent on any method
	public static void m1() {
//	super.m1();
		
		System.out.println("A m1");
	}
}
class B{
	public static void m1() {
		System.out.println("B m1");
		throw new RuntimeException();
	}
}

// B is the superclass and A is the subclass
public class Quiz1 {
	public static void main(String[] args) {
//		B a= new A();
//		a.m1();
		A a1 = new A();
		a1.m1();
	}

}
