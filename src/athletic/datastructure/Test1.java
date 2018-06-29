package athletic.datastructure;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Test1<T> {

    public void testMethod(T t) {

        System.out.println(t.getClass().getName());


    }

//    public <T> T testMethod1(T t){
//
//        return t;
//    }

    //范型方法和类没什么关系，使用不同的字母区分开

    public <E> E testMethod1(E e) {

        return e;
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {

        Test1<String> t = new Test1<>();
        t.testMethod("fuck");


        Integer integer = t.testMethod1(new Integer(1));

        System.out.println(integer);


        List<Integer> list = new ArrayList<>();

        list.add(12);
//这里直接添加会报错
//        list.add("a");
        Class<? extends List> clazz = list.getClass();
        Method add = clazz.getDeclaredMethod("add", Object.class);
//但是通过反射添加，是可以的
        add.invoke(list, "kl");

        System.out.println(list);

    }


}
