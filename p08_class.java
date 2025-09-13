package practice;


class student{
	int id;
	student(int a){
		id = a;
	}
	public void intro() {
		System.out.println("My id is "+id);
	}
}

public class p08_class {
	

	public static void main(String[] args) {
		student ob1 = new student(20);
		student ob2 = new student(30);
		ob1.intro();
		ob2.intro();
		
		
	}

}
