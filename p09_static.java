package practice;


class hero{
	 int hId ;
	hero(int a){
		hId = a;
	}
}

public class p09_static {
	
	static class student{
		static int id =0;
		 private int stdid =0;
		student(){
			id++;
			stdid = id;
		}
	}

	public static void main(String[] args) {
		hero obj1 = new hero(50);
		System.out.println(obj1.hId);
		
		
		
//		student std1 = new student();
//		student std2 = new student();
//		System.out.println(std1.stdid);
//		System.out.println(std2.stdid);
	}

}
