
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myNumber= 5;
		String website = "Hello World";
		char letter = 'r';
		double dec = 5.99;
		boolean myCard = true;
		System.out.println(myNumber+ "is an integer variable");
		
		//Arrays-store multiple values into a variable
		int[] arr = new int[5];
		arr[0]=1;
		arr[1]=2;
		
		//integer iteration
		int[] arr2= {1,2,3,4,5,6};
		System.out.println(arr2[2]);
		
		for(int i=0; i< arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		//String iteration
		String[] name = {"Madalina", "Fron"};
		
		for (int i=0; i< name.length; i++) {
			System.out.println(name[i]);
		}
				
		//iteration
		for(String s: name) {
			System.out.println(s);
		}
	}

}
