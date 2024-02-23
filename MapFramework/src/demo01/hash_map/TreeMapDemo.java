package demo01.hash_map;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer,String> batch1 = new TreeMap<Integer,String>();
		batch1.put(103,"raj");
		batch1.put(101,"sravan");
		batch1.put(102,"kaustubh");
		
		System.out.println(batch1);
		
		TreeMap<Integer,String> batch2 = new TreeMap<Integer,String>();
		batch2.put(104,"madhav");
		batch2.put(105,"harsh");
		batch2.put(106,"manish");
		
		System.out.println(batch2);
		
		TreeMap<Integer,String> batch3 = new TreeMap<Integer,String>();
		batch3.putAll(batch2);
		
		//key cannot be duplicated in treemap
		//but values can and override
		batch3.put(105,"maduri");
		System.out.println(batch3);
		
		batch3.put(107, "pavan");
		System.out.println(batch3);
		
		//null key is not accepted
		batch3.put(null, "jay");
		System.out.println(batch3);
		
		batch3.put(110,"kaustubh");
		System.out.println(batch3);

		

	}

}
