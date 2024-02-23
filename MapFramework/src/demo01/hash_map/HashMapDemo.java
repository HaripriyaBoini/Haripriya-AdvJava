package demo01.hash_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> batch1 = new HashMap<Integer,String>();
		batch1.put(101,"raj");
		batch1.put(102,"kiran");
		batch1.put(103,"pavan");
		System.out.println(batch1);
		
		HashMap<Integer,String> batch2 = new HashMap<Integer,String>();
		batch2.put(104,"madu");
		batch2.put(105,"prachi");
		batch2.put(106,"kirthi");
		System.out.println(batch2);
		
		HashMap<Integer,String> batch3 = new HashMap<Integer,String>(batch1);
		System.out.println(batch3);
		
		batch3.putAll(batch2);
		System.out.println(batch3);
		
		//can hashmap store duplicate keys?  -->no
		
		batch3.put(105,"maduri");
		System.out.println(batch3);
		
		// duplicates values are allowed
		batch3.put(107, "pavan");
		System.out.println(batch3);
		
		//null
		// map can store null as key 
		batch3.put(null, null);
		System.out.println(batch3);
		
		
		//remove accesses and remove element
		String removedStudent = batch3.remove(103);
		System.out.println(removedStudent);
		System.out.println(batch3);
		
		//get just access the element
		String studentRetreived = batch3.get(101);
		System.out.println(studentRetreived);
		System.out.println(batch3);
		
		System.out.println(batch3.containsKey(104));
		System.out.println(batch3.containsValue("manish"));
		
		//replace
		batch3.replace(102,"ravi ");
		System.out.println(batch3);
		
		//check whether batch is empty
		System.out.println(batch3.isEmpty());
		System.out.println(batch3.size());
		
		//keys,values
		System.out.println(batch3.values());
		System.out.println(batch3.keySet());
		 
		//Iterating with keys
		Set<Integer> batch3Keys = batch3.keySet();
		
				int sNo=0;
		for(Integer key: batch3Keys) {
			sNo++;
			System.out.println(" key "+sNo+"-"+key);
		}
		// Iterating with values
		Collection<String> batch3Values =  batch3.values();
		sNo = 0;
		for(String value:batch3Values) {
			sNo++;
			System.out.println("Value"+sNo+"-"+value);
			
			batch3.clear();
			System.out.println(batch3);
			
			batch3.size();
			System.out.println(batch3);
			System.out.println(batch3.isEmpty());
		}
		
		
		
		
		

	}

}
