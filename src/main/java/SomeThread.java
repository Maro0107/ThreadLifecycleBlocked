public class SomeThread implements Runnable {

    public static synchronized void test(){
        while (true){

        }
    }
    @Override
    public void run() {

        test();
    }
}
