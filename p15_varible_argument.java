package practice;

public class p15_varible_argument {
	
	static void show(int ... arr) {
		for(int x: arr) {
			System.out.println("x = "+x);
		}
	 }
	
	static void show(String ... arr) {
		for(String x: arr) {
			System.out.println("x = "+x);
		}
	}
	
 public static void main(String[] args) {
	 
	
	 show(3,5);
	 show("iuk","wajahat","Imran");
	 
	}

}
