package athletic;

public class OneToN {


    public static void main(String ... a){


        int oneCount = numberOf1Between1AndN(1111211111);

        System.out.println(oneCount);


    }

    private static int getOneCount(int n) {

        int count = 0;



        return 0;

    }

    public static int numberOf1Between1AndN(int num) {
        if (num < 1) {
            return 0;
        }
        int len = numberOfLen(num);//得到位数
        if (len == 1) {
            return 1;//如果只有1位，那必然是1，也就说只有一个
        }
        int pow = (int) Math.pow(10, len - 1);//存储起来，避免重复计算
        int maxDigit = num / pow;//最高位数字
        int maxDigitCount = maxDigit == 1 ? num % pow + 1 : pow;//统计最高位为1的情况
        int otherDigitCount = maxDigit * (len - 1) * (pow / 10);//统计剩余位为1的情况
        return maxDigitCount + otherDigitCount + numberOf1Between1AndN(num % pow);
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
