package athletic.offer;

public class Find2Index1 {



    public static void main(String[] args) {

        System.out.println(find(7));

    }


    /**
     * 寻找一个数字中的二进制的个数
     * 每次加一，然后与n-1相与
     * @param n
     * @return
     */

    public static int find(int n){


        int result = 0;

        while (n > 0){

            result ++;
            n = n&(n-1);

        }

        return result;
    }

}
