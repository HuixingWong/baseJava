package javaDeep.泛型;

public class GenricArray {

    public static <T> T[] fun1(T... arg){

        return arg;

    }


    public static void main(String[] args) {


        Integer [] i = fun1(1,2,3,4,5,6);

        Integer [] result = fun1();




    }


}
