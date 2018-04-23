package athletic;

import java.io.File;

public class AplusB {

    public static int getSum(int a, int b) {

        int count = 0;

        while (b !=0){

            int a_ = a ^ b;
            int b_ = (a&b) << 1;

            a = a_;
            b = b_;

            count++;

        }

        System.out.println(count);
        return a;

    }



    public static void main(String ... a){


        int sum = getSum(999999909, 883293828);

        System.out.println(sum);


    }

}
