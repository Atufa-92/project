package mypackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparatordemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(51);
		list.add(33);
		list.add(46);
		
		Comparator<Integer> com = (Integer o1, Integer o2)-> {
				
				if(o1%10>o2%10)
					return 1;
				
				return -1;
			
		};
		//(Integer o1, Integer o2)-> {
//				
//				if(o1>o2 )
//					return 1;
//				
//				return -1;
//			
//			
//		};
		
		Collections.sort(list,com);
		
	
	
	for(int i : list) {
		
		System.out.println(i);
		
	}
	
	}
	
}
