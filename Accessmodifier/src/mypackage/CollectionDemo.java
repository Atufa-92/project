package mypackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo {
	
	
	public static void main(String args[]){  
		
	     List<String> college =new ArrayList<String>();
		
	     college.add("vtu");
	     college.add("kbn");
	     college.add("kct");  
	     college.add("pda");  
		  
	     	     
	     Collections.sort(college );
	    
		Iterator itr=college.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		
		}  
		
				
		ListDemo obj = new ListDemo();
		obj.list();
		//SetDemo obj1 = new SetDemo();
		
		
		
		}  
}
class ListDemo{
	
	public void list() {
		
		Set<Integer> num = new TreeSet<Integer>();
		num.add(10);
		num.add(50);
		num.add(30);
		num.add(30);

	
	
	for(int i : num) {
		
		System.out.println(i);
	}
	
	}
//	class SetDemo{
//		
//		public void list() {
//			
//		Set<Integer> num = new TreeSet<Integer>();
//		
//		num.add(10);
//		num.add(50);
//		num.add(30);
//		num.add(30);
//		
//		
//		for(int i : num) {
//			
//			System.out.println(i);
//		}
//		
//		}
//	}
//

}

