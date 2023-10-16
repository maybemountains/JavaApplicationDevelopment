package Sample;

public class ArrayLecturePractice {
	public static void main(String[] args) {
//		int[] intArray = new int[5];
//		for (int i = 0; i < 5; i++) {
//			intArray[i] = i + 1;
//			System.out.println(intArray[i]);
//		}
//		
//		int[] intArray2 = {1, 2, 3, 4, 5};
//		for (int i = 0; i < 5; i++) {
//			System.out.println(intArray[i]);
//		}
		
		int[] arrayOne = {2, 3, 4, 5, 6};
		int[] arrayTwo = {1, 2, 3, 4, 5};
		for(int i = 0; i < arrayOne.length; i++) {
			for (int j = 0; j < arrayTwo.length; j++) {
				if(arrayOne[i] == arrayTwo[j]) {
					System.out.println("arrayOne[" + i + "] = " + arrayOne[i] + " = " + "arrayTwo[" + j + "] = " + arrayTwo[j]);
				}
			}
		}
	}
}
