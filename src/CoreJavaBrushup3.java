
public class CoreJavaBrushup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//string is an object that return characters
		
		String s1= "Mada Fron Pasniceanu";
		String s2= "Mada Fron Pasniceanu";
		
		//new
		String s3= new String("Welcome");
		String s= "Mada Fron Pasniceanu";
		String[] splittedString= s.split(" ");
		
		for(String split: splittedString) {
			System.out.println(split);
			
		}
		
		for(int i=0; i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		
		for(int i=s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));
		}
	}

}
