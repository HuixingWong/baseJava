package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecyter {


    public static void main(String ... a){


        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Thread thread1 = new Thread(() -> {

            while (true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("123");

            }

        });


        Thread thread2 = new Thread(() -> {

            while (true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("456");

            }

        });

        Thread thread3 = new Thread(() -> {

            while (true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("789");

            }

        });




        executorService.submit(thread1);
        executorService.submit(thread2);
        executorService.submit(thread3);



    }


}
