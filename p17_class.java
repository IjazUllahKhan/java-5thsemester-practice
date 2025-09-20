package practice;


class hero02{
	protected int  x;
	protected int y;
	hero02(int a , int b){
		x = a;
		y = b;
	}
	void show() {
		System.out.println("X = "+x);
		System.out.println("y = "+y);
	}
}

public class p17_class {

	public static void main(String[] args) {
		
		hero02 obj = new hero02(50,60);
		
		
		System.out.println("X = "+obj.x);
		System.out.println("y = "+obj.y);
	}

}
