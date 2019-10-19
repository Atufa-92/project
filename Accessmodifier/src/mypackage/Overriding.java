package mypackage;


 class A {
	
	 
	 public void show() {
		 
		 System.out.println("class A method");
	 }
 
}
 class B extends A{
	 @Override
	 public void show() {
		
		 super.show();
		 System.out.println("class B method");
	 }
 }


public class Overriding {
	
	
	public static void main(String[] args) {
		
		B obj = new B();
		
		obj.show();
	}

}
