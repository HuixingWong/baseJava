package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest {


    public static void main(String[] args) {

        ExecutorService service = new ThreadPoolExecutor(5,
                10,10, TimeUnit.SECONDS,new LinkedBlockingDeque<>());



        service.execute(() -> {
            int i = 0;
            while (i<100){
                try {

                    Thread.sleep(1000);
                    System.out.println("execute方式1");
                    i++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });

        service.execute(() -> {
            int i = 0;
            while (i<100){
                try {
                    Thread.sleep(1000);
                    System.out.println("execute方式2");
                    i++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });

        service.execute(() -> {
            int i = 0;
            while (i<100){
                try {
                    Thread.sleep(1000);
                    System.out.println("execute方式3");
                    i++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });





    }
}
