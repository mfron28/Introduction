import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr2= {1,2,3,4,5,6,7,8,9};
		
		for(int i: arr2) {
			
			if(arr2[i] %2 == 0 ) {
				System.out.println(arr2[i]);
			break;
			}
			else {
				System.out.println(arr2[i]+ "is not multiple of 2");
			}
			
		}
		
		ArrayList<String> a =new ArrayList<String>();//for this class we create an object, new is giving memory space
			a.add("Madalina");
			a.add("Fron");
			a.add("NewName");
			System.out.println(a.get(2));
			
			//for ArrayList we use size, not length 
			for(int i=0; i< a.size(); i++) {
				
				System.out.println(a.get(i));
				
			}
			
			//enhance way to use for
			for(String val: a) {
				System.out.println((val));
			}
			
			System.out.println(a.contains("Fron"));
			
			//lists 
			String[] name = {"Mada", "Fron", "Pasniceanu"};
			List<String> nameArrayList =Arrays.asList(name);
			nameArrayList.contains("gddgd");
			
			
			
	}

}
