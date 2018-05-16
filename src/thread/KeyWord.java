package thread;

public class KeyWord {


    public static void main(String[] args) {


        Thread thread = new Thread(new Runnable() {

            int i = 0;

            @Override
            public void run() {
                while (true) {
                    System.out.println(i);
                    i++;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        System.out.println("this is wrong");
                    }

                    if (i==5){
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        thread.start();

        new Thread(() -> {

            for (int i =0;i<20;i++){

                System.out.println("this is the second thread");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println("this is wrong");
                }

            }

        }).start();




    }

}
