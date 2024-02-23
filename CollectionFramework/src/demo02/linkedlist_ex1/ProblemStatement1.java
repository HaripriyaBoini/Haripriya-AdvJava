package demo02.linkedlist_ex1;

import java.util.LinkedList;

public class ProblemStatement1 {

	public static void main(String[] args) {
		LinkedList<String >coreJavaBatch = new LinkedList<String>();
		LinkedList<String >AdvancedJavaBatch = new LinkedList<String>();
		
		coreJavaBatch.add("geeta");
		coreJavaBatch.add("ajay");
		coreJavaBatch.add("arun");
		coreJavaBatch.add("varun");
		coreJavaBatch.add("aruna");
		
		AdvancedJavaBatch.add("abhai");
		AdvancedJavaBatch.add("pallu");
		AdvancedJavaBatch.add("advit");
		AdvancedJavaBatch.add("ronu");
		AdvancedJavaBatch.add("geeta");
		
		System.out.println(coreJavaBatch);
        System.out.println(AdvancedJavaBatch);
        
        LinkedList<String> dataStructuresBatch =  new LinkedList<String>(coreJavaBatch);
        dataStructuresBatch.addAll(AdvancedJavaBatch);
        
        System.out.println( dataStructuresBatch);
        
        // changing the name of the vikram cause 2 batches have same names creating confusion
        
        String originalName=dataStructuresBatch.get(3);
        String newName = originalName+"chauhan";
        dataStructuresBatch.set(3, newName);
        System.out.println(dataStructuresBatch);
        
        dataStructuresBatch.set(5, "vikram sharma");
        System.out.println(dataStructuresBatch);
        
        if(dataStructuresBatch.contains("megha")) {
        	dataStructuresBatch.remove("megha");
        }
        
        System.out.println(dataStructuresBatch);
        System.out.println(dataStructuresBatch.size());
        
        if(!dataStructuresBatch.isEmpty()) {
        	dataStructuresBatch.clear();
        }
        System.out.println(dataStructuresBatch.size());
        
        
        
        
        
		
		
		

	}

}
