package practice;

class A2{
	void showA() {
		System.out.println("Show funciton of class A");
	}
}

class B2 extends A2{
	void showB() {
		System.out.println("Show funciton of class b");
	}
}

public class p21 extends B2 {

	public static void main(String[] args) {
		
		A2 obj1 = new A2();
		B2 obj2 = new B2();
		p21 obj3 = new p21();
		obj1.showA();
		obj1 = obj2;
		obj1.showA();
		

	}

}
