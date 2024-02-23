package demo18.inter_thread_comm;

public class Customer {
     private int balance;
     
     Customer(int balance){
    	 this.balance=balance;
    	 System.out.println("initial balance "+this.balance);
     
     }
   synchronized  void deposit(int amount) {
    	 System.out.println("going for deposit");
    	 balance = balance+amount ;
    	 System.out.println("\n deposit complete ,new balance: "+balance);
    	 notify();
     }
     
    synchronized void withdraw(int amount) {
    	System.out.println("goin for withdrawl"); 
    	 if(amount>balance)
    	 {
    		 System.out.println(" less balance ,waiting for deposit   ");
    		 try {
    			 wait();
    		 }catch(InterruptedException e) {
    			 e.printStackTrace();
    		 }
    	 }
    
    	 balance =balance-amount;
    	 System.out.println(" after withdrawl   balance: "+balance);
     }
     }

