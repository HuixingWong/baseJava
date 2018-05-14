package javaDeep.reflect;

import design.diandioc.AbstractDrive;
import design.diandioc.Car;
import design.diandioc.People;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) {


        try {
            test8();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void test1(){

        Class cls1 = new String("1").getClass();
        Class cls2 = int.class;

        try {
            Class test = Class.forName("hello world");
        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
            System.out.println("find class error:"+e1.getMessage());
        }

    }

    static void test2(){
        Class clzBase = Base.class;
        try {
            Field fieldBase = clzBase.getField("b");
            System.out.println(fieldBase);

            Field d = clzBase.getDeclaredField("d");
            System.out.println(d);
        } catch (NoSuchFieldException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (SecurityException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }


    static void test3(){



        Class slzSub = Sub.class;
        Class subSuperclass = slzSub.getSuperclass();
        try {

            Field b = slzSub.getField("b");
            System.out.println(b);

            Field d = subSuperclass.getDeclaredField("d");
            System.out.println(d);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 获取不存在的方法会报错
     */
    static void test4(){

        Class class1 = Base.class;

        try {
            Method methodtest = class1.getDeclaredMethod("hellowworld");
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    static void test5(){

        Class class1 = Base.class;

        try {

            Method methodtest = class1.getDeclaredMethod("testProtected0");
            Method methodtest1 = class1.getDeclaredMethod("testProtected1",String.class);
            System.out.println(methodtest);
            System.out.println(methodtest1);

            methodtest.invoke(class1.newInstance(),null);
            methodtest1.invoke(class1.newInstance(),"what a fuck");

//            class1.getDeclaredMethod("testProtected0").invoke()



        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }


    /**
     * 如何通过反射获取一个类的内部类或接口
     */
    static void test6(){


        // TODO Auto-generated method stub
        Class clz = Base.class;

        Class[] members = clz.getDeclaredClasses();

        for ( Class c : members ) {
            System.out.println(c.toGenericString());

            Method[] methods = c.getMethods();
        }

    }

    static void test7(){

        Class[] interfaces = People.class.getInterfaces();
        for ( Class c : interfaces ) {
            System.out.println(c.toGenericString());
            try {

                Method[] methods = c.getMethods();
                for (Method method : methods){
                    System.out.println(method);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * 反射获取类并调用方法
     * @throws Exception
     */
    static void test8() throws Exception {

        Class<People> peopleClass = People.class;

        Field abstractDrive = peopleClass.getDeclaredField("abstractDrive");

        System.out.println(abstractDrive);

        Class<AbstractDrive> abstractDriveClass = AbstractDrive.class;
        Method[] methods = abstractDriveClass.getMethods();
        for (Method method : methods){
            System.out.println(method);
        }

        Method goOut = peopleClass.getMethod("goOut");

        People people = peopleClass.newInstance();

        Method setDrive = peopleClass.getMethod("setDrive",AbstractDrive.class);

        setDrive.invoke(people,new Car());

        goOut.invoke(people,null);
//        goOut.invoke(,)


    }
}
