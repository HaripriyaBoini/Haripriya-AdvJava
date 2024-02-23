package demo9.iteration;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;

public class IteratorDemo1 {

	public static void main(String[] args) {
	         ArrayList<String> a1 = new ArrayList<String>();
	         //HashSet<String> a1 = new HashSet<String>();
	         //PriorityQueue<String> a1 = new PriorityQueue<String>();
	         
	         a1.add("E");
	         a1.add("C");
	         a1.add("B");
	         a1.add("D");
	         a1.add("A");
	         
	        
	         Iterator<String> strIterator = a1.iterator();
	         // E C B A
	         
	         System.out.println("Before"+a1);
	         int i =1;
	         while(strIterator.hasNext()) {
	        	 String strValue = strIterator.next();
	        	 
	        	 if(strValue.equals("D")) {
	        		 strIterator.remove();
	        		 
	        	 }
	        	 System.out.println("Element no"+i+":"+strValue);
	        	 i++;
	         }
	              System.out.println("After"+a1); 
	         

	}

}
