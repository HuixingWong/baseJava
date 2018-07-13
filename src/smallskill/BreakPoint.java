package smallskill;

import java.util.ArrayList;
import java.util.List;

public class BreakPoint {


   static String str =  "hello";

    public static void main(String[] args) {


//        System.out.println(str);
//
//        str = "fuck";
//
//        System.out.println(str);
//
//        System.out.println("over");

        test();


    }
    public static void test(){

        List<String>  strings = new ArrayList<>();
        strings.add("this is 1");
        strings.add("this is 2");
        strings.add("this is 3");
        strings.add("this is 4");
        strings.add("this is 5");

        for (String s: strings
             ) {

            System.out.println(s);
        }


    }

}
