package anomations;

import java.lang.reflect.Method;

public class AnotationProcessor {

    public static void main(String ... a){

        Method [] methods = AnomationTest.class.getDeclaredMethods();

        for (Method m:methods){

            GEt gEt = m.getAnnotation(GEt.class);

            System.out.println(gEt.value());

        }


    }

}
