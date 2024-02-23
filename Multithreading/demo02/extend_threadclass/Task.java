package demo02.extend_threadclass;

public class Task extends Thread {
	
	    private char ch;

	    public Task(char ch) {
	        this.ch = ch;
	    }

	    @Override
	    public void run() {
	        for (int i = 0; i < 3; i++) {
	            System.out.println("ch = " + ch++);
	        }
	    }
	}

