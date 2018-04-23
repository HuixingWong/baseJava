package athletic;

import java.util.Arrays;

public class InserationSort {

    private static  void sortSmall(int [] arr,int l,int r){

        for (int i =l;i <= r;i++){

            int j = i;
            int current = arr[i];
            while (j>l && arr[j-1] > current)
                arr[j] = arr[--j];

            arr[j] = current;

        }
    }

    private static void sort(int [] arr,int l,int r){

        if (l >= r){
            return;
        }

//        if (r - l < 16){
//
//            sortSmall(arr,l,r);
//            return;
//        }

        int mid = (l+r)/2;
        sort(arr,l,mid);
        sort(arr,mid+1,r);
        merge(arr,l,mid,r);

    }

    private static void merge(int[] arr, int l, int mid, int r) {

        int [] temp = Arrays.copyOfRange(arr,l,r+1);
        int i = l,j = mid+1;

        for (int k = l;k<=r;k++){

            if (i > mid){

                arr[k] = temp[j-l];j++;

            }else if (j > r){

                arr[k] = temp[i-l];i++;

            }else if (temp[i-l] < temp[j-l]){

                arr[k] = temp[i-l];i++;


            }else {

                arr[k] = temp[j-l];j++;

            }

        }




    }


    public static void main(String ... a){

//        int [] arr = new int [10000000];
//        for (int i = 0;i<arr.length-1;i++){
//
//            arr[i] = (int) (Math.random()*10000);
//
//        }
//
////        sortSmall(arr,arr.length);
//
//
//        long l = System.currentTimeMillis();
//        sort(arr,0,arr.length-1);
//        System.out.println(System.currentTimeMillis()-l);
//
////        for (int i:arr) {
////
////            System.out.println(i);
////        }
//        long sum = 0;
//        for (int i=0;i<20;i++){
//            sum += test();
//        }
//
//        System.out.println(sum/20);

        test();

    }

    public static long test(){

        int [] arr = new int [100];
        for (int i = 0;i<arr.length-1;i++){

            arr[i] = (int) (Math.random()*10000);

        }

//        sortSmall(arr,arr.length);


        long l = System.currentTimeMillis();
        sort(arr,0,arr.length-1);
        for (int i=0;i<arr.length;i++){
            System.out.println("i="+i+",arr[i]= "+arr[i]);
        }
        return System.currentTimeMillis()-l;

    }


}
