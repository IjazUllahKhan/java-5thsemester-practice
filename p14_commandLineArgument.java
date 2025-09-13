package practice;

public class p14_commandLineArgument {

	public static void main(String[] args) {
		
		
		
		int x = Integer.parseInt(args[0]);
				
		int y = Integer.parseInt(args[1]);
		int sum = x + y;
		System.out.println(sum);
		
		
//		for(String x: args) {
//			System.out.println("Argument: "+x);
//		}

	}

}
