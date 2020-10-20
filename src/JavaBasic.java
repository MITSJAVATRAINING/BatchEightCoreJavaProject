
public class JavaBasic {
	
	public int sum(int a, int b) {
		
		int c = a+b;
		return c;
		//System.out.println("The sum of numbers a and b is "+ c);
	}

	public static void main(String args[]) {
		
		JavaBasic obj1 = new JavaBasic();
		
		Fruit orange = new Fruit();
		orange.assginFruitName("Orange");
		System.out.println("Fruit Name is " + orange.fruitName);
		
		int c = obj1.sum(10,20);
		System.out.println("The value of c inside main is " + c);
		obj1.sum(15, 20);
		
//		
//		int a = 10; // Primitive Type
//		Integer b = 10;
//		
//		//String name1 = "Shaleen";
//		//String name2 = "Shaleen";
//			String name1 = new String("Shaleen");
//			String name2 = new String("Shaleen");
//		
//		if (name1.equals(name2)) {
//			System.out.println("equals");
//		} else {
//			System.out.println("Not equals");
//		}
//		
//		
//		int[] array1 = {10,20,30,40,50};
//		
//		System.out.println("Value stored at 2nd index " + array1[2]);
//		
//		int[] array2 = new int[3];
//		array2[0] = 45;
//		array2[1] = 46;
//		array2[2] = 50;
//		
//		for (int i= 0;i<array2.length;i++) {
//			System.out.println("Value stored at index " + i + " is " + array2[i] );
//		}
	}
}
