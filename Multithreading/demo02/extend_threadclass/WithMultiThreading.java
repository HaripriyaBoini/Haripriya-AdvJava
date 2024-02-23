package demo02.extend_threadclass;

//import demo01.intro.Task;


  public class WithMultiThreading {

    public static void main(String[] args) {
        System.out.println("----------1------------");

        Task task1 = new Task('a');
        task1.start();

        System.out.println("--------------2----------");

        Task task2 = new Task('A');
        task2.start();

        System.out.println("----------3----------");
    }
}