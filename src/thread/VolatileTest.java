package thread;

public class VolatileTest {


    static   int i = 0;

    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                i = 10;
                System.out.println("xiancheng1:" + i);
                i++;
            }
        });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("xiancheng2:" + i);
            }
        });

        thread.start();
        thread1.start();


    }

}
