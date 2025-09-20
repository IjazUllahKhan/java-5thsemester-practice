package practice;


final class A24{
	void showA() {
		System.out.println("Class A function");
	}
}


class B24 {
	final void showB() {
		System.out.println("Class B function");
	}
}

public class p24 extends B24 {
	void showP() {
		System.out.println("Class p24 function");
	}


	public static void main(String[] args) {
		 
		
		A24 obj1  = new A24();
		B24 obj2 = new B24();
		p24 obj3 = new p24();
		
		obj1.showA();
		obj3.showB();
		
	}

}
