package practice;

abstract class A23{
	A23(){
//		System.out.println("Abstract class contructor..");
	}
	abstract void show();
}

class B23 extends A23{
	B23(){
//		System.out.println("B class contructor..");
	}
	void show() {
		System.out.println("B class Function...");
	}
}

public class p23 extends B23 {
	void show() {
		System.out.println("p23 class Function...");
	}

	public static void main(String[] args) {
		
		A23 obj1;
		B23 obj2 = new B23();
		p23 obj3 = new p23();
		obj1 = obj2;
		obj1.show();
		obj1 = obj3;
		obj1.show();
		
	}

}
