public class HelloThread extends Thread {
    public static void main(String[] args) {
        HelloThread ht = new HelloThread();
        ht.run();
    }

    @Override
    public void run() {
        System.out.println("hello");
    }
}




