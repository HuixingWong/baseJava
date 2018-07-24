package athletic.offer;

public class Find1 {


    public static int count1(int n){

        int count = 0;

        while (n != 0){

            count += n & 1;
            n >>>= 1;

        }


        return count;
    }

    public static int count2(int n){


        int res = 0;
        while (n != 0){

            n = n & n-1;
            res++;

        }

        return res;
    }

    public static void main(String[] args) {


        System.out.println(count2(28));

    }

}
