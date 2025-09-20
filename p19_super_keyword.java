package practice;



class A{
	int x ;
	A(){
		x = 10;
	}
	void show() {
		System.out.println("A class Show function.....");
	}
}

class B extends A{
	int x ;
	B(){
		x = 20;
	}
	void show(){
		System.out.println("B class show function....");
		System.out.println("X of A clss: "+super.x);
	}
}

public class p19_super_keyword extends B {
	
	public static  void main(String[] args) {
		A obj1 = new A();
		B obj2 = new B();
		p19_super_keyword obj3 = new p19_super_keyword();
		
		obj2.show();
		
	}

}
