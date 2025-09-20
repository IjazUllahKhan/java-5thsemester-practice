package practice;


class A3{
	void show() {
		System.out.println("Show funciton of class A");
	}
}

class B3 extends A3{
	void show() {
		System.out.println("Show funciton of class b");
	}
}

public class p22 extends B3{
	void show() {
		System.out.println("Show funciton of class p22");
	}

	public static void main(String[] args) {
		
		A3 obj1;
		B3 obj2 = new B3();
		p22 obj3 = new p22();
		obj1 = obj2;
		obj1.show();
		obj1 = obj3;
		obj1.show();
		
	}

	

}
