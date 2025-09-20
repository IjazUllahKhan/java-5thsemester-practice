package practice;


class parentClass{
	protected int x ;
	protected int y;
	parentClass(int a, int b){
		System.out.println("Parent class constructor called");
		x = a;
		y = b;
	}
	 void show() {
			System.out.println("X = "+x);
			System.out.println("y = "+y);
			
		}
}

public class p16_childClass extends parentClass {

	int c;
	int d;
	p16_childClass(int a, int b){
		super(a*10,b*40);
		System.out.println("Child class Constructor Called");
		c = a;
		d = b;
	}
	
	 void show2() {
		System.out.println("c = "+c);
		System.out.println("d = "+d);
		
	}

	public static void main(String[] args) {
		p16_childClass obj = new p16_childClass(20,30);
		obj.show();
		obj.show2();
		

	}

}
