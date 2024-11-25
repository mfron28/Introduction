
public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1,2,3,4,5};
		
		System.out.println(numbers[0]);
		System.out.println(numbers[4]);
		
		for(int i=numbers.length-1; i>=0; i--) {
			System.out.println(numbers[i]);
		}

		System.out.println(numbers.length);
	}

}
