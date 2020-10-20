
public class Fruit {
	
	public Fruit() {
		
	}
	
	String fruitName;

	public Fruit(String name) {
		this.fruitName = name;
	}

	/*
	 * data 
	 * behaviour
	 * * * */
	
	void assginFruitName(String name) {
		this.fruitName = name;
	}
	
	public static void main(String args[]) {
		Fruit mango = new Fruit("Mango");
		//mango.assginFruitName("Mango");
		Fruit banana = new Fruit();
		banana.assginFruitName("Banana");
		
		System.out.println("name of mango object is " + mango.fruitName);
		System.out.println("name of banana object is " + banana.fruitName);
	}
}

/*
 * Create a class calculator define behaviour sum and multiply which takes 2 input and return the calculated value to the main method.
 * **/
