package practice;

public class p02_array {

	public static void main(String[] args) {
		int num[];
		num = new int[5];
		for(int i =0;i<num.length;i++) {
			num[i] = 10*i;
		}
		
		num[3] = 3000;
		
		for(int i =0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		

	}

}
