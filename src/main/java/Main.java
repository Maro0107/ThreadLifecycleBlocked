public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new SomeThread());
        Thread thread2 = new Thread(new SomeThread());

        thread1.start();
        thread2.start();

        Thread.sleep(100);

        System.out.println("Thread 1 "+ thread1.getState());
        System.out.println("Thread 2 "+ thread2.getState());

    }
}
