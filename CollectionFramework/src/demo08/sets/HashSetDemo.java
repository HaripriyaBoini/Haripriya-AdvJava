package demo08.sets;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> batch1 = new HashSet<String>();
		batch1.add("abhi");
		batch1.add("ashutosh");
		batch1.add("megha");
		batch1.add("sohaib");
		batch1.add("chetan");
		batch1.add(null);
		
		System.out.println(batch1);
		
		HashSet<String> batch2 = new HashSet<String>();
		batch2.add("abhi");
		batch2.add("harsh");
		batch2.add("madhav");
		
		System.out.println(batch2);
		
		HashSet<String> mergedBatch = new HashSet<String>(batch1);
		mergedBatch.addAll(batch2);
		System.out.println(mergedBatch);
		
		mergedBatch.add("ashutosh");
		System.out.println(mergedBatch);
		
		mergedBatch.forEach(student->System.out.println("maintain discipline"+student));
		
		mergedBatch.removeAll(batch1);
		System.out.println(mergedBatch);
		
		mergedBatch.removeIf(student->student.contains("d"));
		System.out.println(mergedBatch);
		
		
		
		
		
	}

}
