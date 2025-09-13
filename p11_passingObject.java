package practice;

public class p11_passingObject {
	int x,y;
	p11_passingObject(){
		x = 20;
		y = 30;
	}
	
	void fun(p11_passingObject ob) {
		ob.x = 50;
		ob.y = 333;
	}

	public static void main(String[] args) {
		
		p11_passingObject obj = new p11_passingObject();
		System.out.println("X = "+obj.x + " Y = "+obj.y );
		
		obj.fun(obj);
		System.out.println("X = "+obj.x + " Y = "+obj.y );
		
	}

}
