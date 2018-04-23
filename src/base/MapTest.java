package base;


import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapTest<T> {

    private  T a;

    public MapTest(T a) {
        this.a = a;
    }

    public static void main(String... a) {

        try {

            Class<?> MyMap = Class.forName("java.util.HashMap");

            Field ageField = MyMap.getDeclaredField("threshold");

            System.out.println(ageField);


            Map<Integer, String> map = new HashMap(100, 2);

            for (int i = 0; i <= 200; i++) {

                map.put(i, "this is the index " + i);

                System.out.println("i is " + i + "  ,map's size is: " +
                        map.getClass().getDeclaredField("threshold").getAnnotatedType());

            }


        } catch (Exception e) {
            e.printStackTrace();
        }


        MapTest<String> mapTest = new MapTest<>("123");

        String t = mapTest.getT();


    }


    public T getT(){
        return a;
    }


}
