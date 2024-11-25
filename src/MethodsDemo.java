
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsDemo d =new MethodsDemo();
		String name= d.getData();
		System.out.println(name);
		
		MethodsDemo2 d1= new MethodsDemo2();
		String name2= d1.getUserData();
		System.out.println(name2);
		
		getData2();
	}
	  
	//this method can be accessed from any class we have
	public String getData() {
		System.out.println("hello world");
		return "Madalina";
	}

	//we can access it without creating an object, because is static method
	public static String getData2() {
		System.out.println("Bunaa");
		return "Romania";
	}
}
