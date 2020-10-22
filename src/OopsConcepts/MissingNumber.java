package OopsConcepts;

public class MissingNumber {

	public static void main(String[] args) {
		int[] array = new int[]{1,2,6,7,3,5,8,10,9};
		int[] indexes = new int[11];
		
		for(int i=0;i<array.length;i++) {
			indexes[array[i]] = 1;
		}
		
		int missingNumber = 0;
		for (int i =1;i<indexes.length;i++) {
			System.out.println(indexes[i]);
			if (indexes[i] == 0) {
				missingNumber = i;
			}
		}
		
		System.out.println("Missing number is "+ missingNumber);
	}

}
