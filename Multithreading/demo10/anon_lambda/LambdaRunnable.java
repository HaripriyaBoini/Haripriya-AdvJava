/*package demo10.anon_lambda;

class Task implements Runnable {
	

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            Thread t = Thread.currentThread();
            System.out.println("\n id:" + t.getId());
        }
    }
}

public class LambdaRunnable {
    public static void main(String[] args) {
        Task t1 = new Task();
       
	
        Thread th1 = new Thread(t1);
        th1.start();

        // Lambda Expression - definition of run()
        Runnable r1 = () -> {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + ", " + t.getId() + " ," + t.getPriority());
        };
        Thread th2 = new Thread(r1, "Task2");
        th2.start();
    }
}
*/
