package mypackage;


 class Outerclass{
	 
	 public void fristMethod() {
		 
		 System.out.println("outer class");
	 }
	
	 class Innerclass{
	 //public static class Innerclass{
		 public void innerMethod(){
			 
			 System.out.println("inner class");
			 
		 }
	 }
	 
	 public void secodMethod() {
		 String[] student =  {"studen1","student2","student3","student4"};
		 for(String i : student) {
			 System.out.println("the list of the stident is" + " " + i);
		 }
		 
		 
	 }
	 
}


public class Deomoinnerclasses {

	public static void main(String[] args ) {
		
		Outerclass obj = new Outerclass();
		obj.fristMethod();
		Outerclass.Innerclass obj1 = obj.new Innerclass();
		//Outerclass.Innerclass obj1 = new Outerclass.Innerclass();
		obj1.innerMethod(); 
		
		obj.secodMethod();
		
		DemointerfaceImpl obj2 =  new DemointerfaceImpl ();
		
		obj2.interfaceMethod();
	}
	
	
}
