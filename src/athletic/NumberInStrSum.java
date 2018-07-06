package athletic;

public class NumberInStrSum {


    public static int getSum(String str) {

        if (str == null || str.length() == 0) {
            return 0;
        }

        int res = 0;

        int num = 0;

        boolean isPositive = true;

        int cur;

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            cur = chars[i] - '0';
            if (cur < 0 || cur > 9) {
                res += num;
                num = 0;
                if (chars[i] == '-') {

                    if (i - 1 > -1 && chars[i - 1] == '-') {
                        isPositive = !isPositive;
                    } else {
                        isPositive = false;
                    }
                } else {
                    isPositive = true;
                }
            } else {

                num = num * 10 + (isPositive ? cur : -cur);

            }

        }
        res += num;
        return res;

    }

    public static void main(String[] args) {

        int sum = getSum("abc21-43fg100");

        System.out.println(sum);


    }


}
