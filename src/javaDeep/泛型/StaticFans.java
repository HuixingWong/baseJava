package javaDeep.泛型;

public class StaticFans {

    //静态函数
    public static  <T> void staticMethod(T a){


        System.out.println(a.toString());

    }

    //普通函数

    public <T> void OtherMethod(T a){
        System.out.println(a.toString());
    }


    public static void main(String[] args) {


        StaticFans.staticMethod("fuck");

        StaticFans.<String>staticMethod("fuck");

        StaticFans.staticMethod(1);



        StaticFans staticFans = new StaticFans();

        staticFans.OtherMethod(1);


    }


}
