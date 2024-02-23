package demo01.intro;

public class Task {
	char ch;
	public Task(char ch){
		this.ch = ch;
		
	}
	public void run() {
		for(int i =0;i<3;i++) {
			System.out.println("ch = "+ch++);
		}
	}

}
