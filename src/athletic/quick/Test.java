package athletic.quick;

import athletic.QuickSort;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test {

    public static int count = 10000*10000;

    public static int times = 20;




    public static void main(String ... a){

       long sum = 0;
        for (int i=0;i<times;i++){

           sum += test3();
        }

        System.out.println(sum/times);

//        test1();



    }

    private static long test1(){
        Long l1 = System.currentTimeMillis();
        QuickSortBasic basic = new QuickSortBasic();
        int [] arr = new int [10000000];
        for (int i = 0;i<arr.length-1;i++){

            arr[i] = (int) (Math.random()*10000);

        }
        basic.sort(arr);
//        System.out.println(System.currentTimeMillis()-l1);
        return System.currentTimeMillis()-l1;
    }

    private static  long test2(){

        Long l1 = System.currentTimeMillis();
        QuickSort3Way basic = new QuickSort3Way();
        int [] ls = new int[count];
        for (int i=0;i<ls.length;i++){

            ls[i] = (int) (Math.random()*count);

        }
        basic.sort(ls);
//        System.out.println(System.currentTimeMillis()-l1);
        return System.currentTimeMillis()-l1;

    }


    private static  long test3(){

        Long l1 = System.currentTimeMillis();
        QuickSortDualPivot basic = new QuickSortDualPivot();
        int [] arr = new int [10000000];
        for (int i = 0;i<arr.length-1;i++){

            arr[i] = (int) (Math.random()*10000);

        }
        basic.sort(arr);
//        System.out.println(System.currentTimeMillis()-l1);
        return System.currentTimeMillis()-l1;

    }

    private static  long test4(){

        Long l1 = System.currentTimeMillis();
        int [] ls = new int[count];
        for (int i=0;i<ls.length;i++){

            ls[i] = (int) (Math.random()*count);

        }
        QuickSort.sort(ls);
//        System.out.println(System.currentTimeMillis()-l1);
        return System.currentTimeMillis()-l1;

    }

}


