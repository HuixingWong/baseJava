import java.util.ArrayList;
import java.util.List;

public class test {

    private  static int[] ls = new int[]{1,2,3,4,5,6,7,8,9};

    public static void main(String ... args){



//        String str = "123456789123456789";
//        String substring = str.substring(0, 16);
//        System.out.println(substring.length());


//        String s = "2018.02.05啦啦啦";
//
//        String substring1 = s.substring(0, 10);
//        System.out.println(substring1);


        int i = Integer.MAX_VALUE;

       long l = (long) Math.pow(2,31);

        System.out.println(i);
        System.out.println(l);

        List<String> list = new ArrayList<>();
        list.forEach(System.out::println);

    }

}
