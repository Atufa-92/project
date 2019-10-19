package mypackage;

public class Apple {

	public void fruits(Orange orange) {
		orange.color();
	}
	
	
	public static void main(String[] args) {
		
		Apple app = new Apple();
		
//		OrangeImp imp = new OrangeImp();
//		imp.color();
//		
//		app.fruits(imp);
		
		Orange myLambda = () -> {
			System.out.println("color is orange");
		};
		
		
		myLambda.color();
		
	}
}
