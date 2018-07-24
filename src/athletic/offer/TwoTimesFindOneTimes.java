package athletic.offer;

public class TwoTimesFindOneTimes {



    //从多个对中找到一个单
    public static  int twoFindone(int [] arr){

        int res = 0;
        for (int i = 0; i <arr.length; i++) {


            res = res ^ arr[i];

        }

        return res;

    }

    //从多个对中找到两个单
    public static void printOddTimesNum(int[] arr) {
        int eO = 0;
        int eOhasOne = 0;

        for (int cur : arr) {
            eO = eO ^ cur;
        }

        int rightOne = eO & (~eO + 1);
        for (int cur : arr) {
            if ((rightOne & cur) != 0) {
                eOhasOne = eOhasOne ^ cur;
            }
        }

        System.out.println("eOhasOne = " + eOhasOne + "  " + (eOhasOne ^ eO));
    }

    //任何整数 n 与 0 异或总等于其本身 n，一个数与其本身异或那么结果肯定是 0。
    //多个数异或操作，遵循交换律和结合律。
    public static void main(String[] args) {


        int [] arr = new int[]{22,22,33,44,33,44,55,66,55,65,76,65,76,97};
        System.out.println(twoFindone(arr));

        printOddTimesNum(arr);

        System.out.println(~1);


    }

}
