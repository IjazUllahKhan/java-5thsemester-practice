package practice;


class student_1{
	int stdId;
	student_1(int a){
		System.out.println("OUter class constructor called");
		stdId = a;
	}
	public void outFun(int y) {
		System.out.println("Ouster class function: i recieved "+y);
	}
	class topper{
		
		int tprId ;
		topper(int a){
			System.out.println("inner class constructor called");
			tprId = a;
		}
		
		public void innFun() {
			System.out.println("INner class function\n topperId:  "+tprId);
		}
	}
}

public class innerClass {

	public static void main(String[] args) {
		student_1 obj1 ;
		obj1 = new student_1(50);
		obj1.outFun(45);
		student_1.topper obj2 = obj1.new topper(555);
		obj2.innFun();
	}

}
