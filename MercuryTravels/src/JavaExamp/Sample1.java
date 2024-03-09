package JavaExamp;

class myclass{
	
	void m1() {
		System.out.println("Manual Testing");
	}
	void m2() {
		System.out.println("Automation Testing");
	}	
}
class myclass2{
	void m3() {
		System.out.println("Selenium With java");
	}
}
public class Sample1 {

	public static void main(String[] args) {
		myclass obj=new myclass();
		myclass2 obj2=new myclass2();
		obj.m1();
		obj.m2();
		obj2.m3();
		

	}

}
