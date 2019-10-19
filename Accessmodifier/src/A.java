import mypackage.D;

public class A extends D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		B obj = new B();
//		obj.msg();
//		System.out.println(obj.data);
		
		C obj = new C();
		obj.show();
		
		A obj1 = new A();
		obj1.first();
		
	}

}

class B{
	
	private int data = 40;
	
	private void msg() {
		
		System.out.println("java lang");
		
	}
	
	
	

}
