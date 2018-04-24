package interview.Exception;

/**
 *  https://love2.io/@funkkiid/doc/android_interview//java/basis/finally-return.md
 *
 *  关于try catch finally的执行顺序以及返回值顺序
 *  详解复制上面链接查看
 */
public class TheSequenceOfFinally {


    public static void main(String[] args) {

        System.out.println(test1());
    }

    public static int test1() {
        int b = 20;

        try {
            System.out.println("try block");

            return b += 80;
        } catch (Exception e) {

            System.out.println("catch block");
        } finally {

            System.out.println("finally block");

            if (b > 25) {
                System.out.println("b>25, b = " + b);
            }
            b += 20;
        }

        return b;

    }


}
