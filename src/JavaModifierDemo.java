
public class JavaModifierDemo {

	static void method1() {
		
	}
	static int a = 10;
	
	
	public static void main(String args[]) {
		JavaModifierDemo obj1 = new JavaModifierDemo();
		JavaModifierDemo.method1();
		System.out.println("The value of variable a is "+ obj1.a);
		JavaModifierDemo.a = 20;
		System.out.println("The value of variable a is " + obj1.a);
	}
}
