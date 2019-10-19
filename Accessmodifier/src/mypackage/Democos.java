package mypackage;

public class Democos {

	  
		int id;  
		String name; 
		
		void display(){
			System.out.println(id+" "+name);
			}  
		
		
		  
		



  public Democos(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}







public Democos() {
	super();
}







//		public Democos(int id, String name) {
//			super();
//			this.id = id;
//			this.name = name;
//		}

		

		public int add(int a, int b) {
			return a+b;
			
			
		}
		
		public double add(double a, double b) {
			return a+b;
		}

		
		enum Mobile{
			
			APPLE,SUMSONG;
		}


		public static void main(String args[]){  
		
			Democos s1=new Democos(2,"salma");  
		
		s1.display();  
		
			
			System.out.println(s1.add( 5,10 ));
			
			 System.out.println(s1.add(5.7, 2.3)); 
			
			
			
			
			Encapsulation encaps = new Encapsulation();
		encaps.setId(1);
		encaps.setName("kbn");
		
		 long a = encaps.getId();
		String b = encaps.getName();
		
		System.out.println(a+" "+b);
		
		//System.out.println(encaps.getId()+""+encaps.getName());
		
		
		
		Color c3 = Color.BLUE;
		System.out.println(c3);
		
		
		
		
		
		
		}
		
		
		}  
		 
	

