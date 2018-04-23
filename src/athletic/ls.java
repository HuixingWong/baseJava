package athletic;

public class ls {


    public static void main(String [] a){


        for (int i=1;i<=20;i++){

            System.out.print(fibo(i)+",");
            if (i % 5 == 0){
                System.out.println();
            }

        }


    }

    public static int fibo(int n){

        if (n == 1 || n == 2){
            return 1;
        }else {

            return fibo(n-1)+fibo(n-2);
        }

    }



}
