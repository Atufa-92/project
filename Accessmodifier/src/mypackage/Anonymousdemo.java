package mypackage;

interface Age{
	int x = 21;
	public void studentAge();
	
}

//  class Student implements Age{
//
//	@Override
//	public void studentAge() {
//		
//		System.out.println("next");
//		
//		
//	}
//	
//	
//}



public class Anonymousdemo {
	
	
	public static void main(String[] args) {
		
		Age obj = new Age()
				{
			
				public void studentAge() {
			
			System.out.println("next");
			
			
		}
		
		
	};

		obj.studentAge();
		
	}

}
