package mypackage;

 class Addition{
	
	public int addition(int marks1, int marks2) {
		
		int sum=0;
		sum = marks1+marks2;
		return sum;
		
	}
	
    public void firstMethod() {
		
		
		int num = 50;
		if(num <9) {
			System.out.println("good");
			
		}else {
			System.out.println("bad");
			
		}
		
		}
    
    public void secondMethod() {
    	
    
    	
    	for(int i=0; i<5; i++) {
    		System.out.println(i);
    	}
    	
    }
    
    
}



public class Demo {

	public static void main(String[] args) {
		
		Addition add = new Addition();
	  int sum = add.addition(15, 5);
	System.out.println("the sum is" + " " +sum);
		add.firstMethod();
		add.secondMethod();
	
		
	}
	

}





