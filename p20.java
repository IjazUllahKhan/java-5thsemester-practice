package practice;


class A1{
	static String show() {
		System.out.println("This is String Funciton");
	}
}

public class p20 extends A1 {
	
 static	int show() {
		System.out.println("This is int funciton");
		return 20;
	}
 
	public static void main(String[] args) {
		System.out.println(show());
	}

}
