package athletic;

public class Plalindrome {


    public static boolean isPlalindmore(int number) {


        String str = number + "";

        int n = str.length() / 2;


        char[] chars = str.toCharArray();

        for (int i = 0; i < n; i++) {

            if (chars[i] != chars[str.length() - i - 1]) {
                return false;
            }

        }

        return true;

    }

    public static boolean isPlalindmore2(int number) {


        if (number > -10 && number < 10) {
            return true;
        }

        if (number < 0){
            number = - number;
        }

        int pow = (int) Math.log10(number);

        int a = (int) (number / (Math.pow(10, pow)));

        int b = number;

        while (b > 10) {
            b = b % 10;
        }

        if (a != b) {
            return false;
        } else {

            return isPlalindmore2((int) (number - (a * Math.pow(10, pow))) / 10);

        }


    }


    public static void main(String[] args) {


        System.out.println(isPlalindmore(1221));

        System.out.println(isPlalindmore2(123454321));

        System.out.println(Math.log10(1000));
    }


}
