package exceptionexample;

import java.io.FileInputStream;

public class BasicExample {

	public void readFile() throws Exception {

		FileInputStream is = new FileInputStream("C:/abc.txt");
		is.read();
	}

	public void readFileTryWithResources() {
		try (FileInputStream is = new FileInputStream("C:/abc.txt")) {
			is.read();
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}
	}

	public void divide(Integer a, Integer b) {
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("Exception Handled");
		}
	}
	
	public void checkAge(int age) throws AgeException {
		if (age < 18) {
			throw new AgeException("User is not valid");
		} else {
			System.out.println("Valid user");
		}
	}

	public static void main(String args[]) {
		BasicExample obj = new BasicExample();
		//obj.divide(10, 0);
		//obj.readFile();
		try {
			obj.checkAge(17);
		} catch (AgeException e) {
			System.out.println(e);
		}
	}

}
