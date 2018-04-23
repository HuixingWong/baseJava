package athletic.leetcode;

public class NtoOne {

    public static void main(String[] args) {



         int    i = myOneToN(898986);


        System.out.println(i);

    }


    private static int myOneToN(int n) {

        int count = 0;

        if (n < 1) {

            return 0;

        }


        int rowCount = numberOfLen(n);


        int reduceTime = (int) Math.pow(10, rowCount - 1);

        /**
         * max是最高位的数字
         */
        int max = (n / reduceTime);

        count += max == 1 ? (n % (reduceTime) + 1) : reduceTime;


        /**
         * 是几位的，就循环几次
         */

        for (int i = 0; i < rowCount - 1; i++) {
//            int pow = (int) Math.pow(10, rowCount - 1 - i);

            /**
             * 当前位的值
             */
            int current = n / reduceTime;

            if (current % 10 == 0) {

                count += (reduceTime / 10);

            } else {

                count += (current + 1) * (reduceTime / 10);
            }

            reduceTime = reduceTime / 10;

        }


        /**
         * 循环到最后一位的时候，如果个位是0，结果会大1
         */

        if (n % 10 == 0) {

            count -= 1;

        }

        return count;

    }


    private static int numberOfLen(int num) {
        int len = 0;
        while (num != 0) {
            len++;
            num /= 10;
        }
        return len;
    }

}
