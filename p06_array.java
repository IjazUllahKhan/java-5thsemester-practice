package practice;

public class p06_array {

	public static void main(String[] args) {
		int num[] = {2,4,6,8,10};
		int sum = 0;
		for(int item: num)
			sum += item;
		System.out.println("Average of num =\s"+(sum/num.length));

	}

}
