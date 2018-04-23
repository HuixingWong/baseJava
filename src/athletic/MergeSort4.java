package athletic;

import java.util.Arrays;

public class MergeSort4 {


    //use mergesort to count the reverseCouple
    private static long count = 0;

    private void sort(int [] arr){


        int n = arr.length-1;
        sort(arr,0,n);

    }

    private void sort(int[] arr, int l, int r) {

        if (l >= r){

            return;
        }


        int mid = (l+r)/2;
        sort(arr,l,mid);
        sort(arr,mid+1,r);
        merge(arr,l,mid,r);


    }

    private void merge(int[] arr, int l, int mid, int r) {


        int[] temp = Arrays.copyOfRange(arr,l,r+1);

        int i = l,j=mid+1;
        for (int k=l;k<=r;k++){


            if (i > mid){
                arr[k] = temp[j-l];j++;
            }else if (j>r){
                arr[k] = temp[i-l];i++;
            }else if (temp[i-l] < (temp[j-l])){


                arr[k] = temp[i-l];i++;


            }else {

                arr[k] = temp[j-l];j++;
                count += (mid + 1 - i);
            }


        }


    }


    public static  void main(String ... args){


        MergeSort4 mergeSort4 = new MergeSort4();

        int [] arr = new int [10000000];
        for (int i = 0;i<arr.length;i++){

            arr[i] = (int) (Math.random()*10000);

        }

//        sortSmall(arr,arr.length);

//        for (int i = 0;i<arr.length;i++){
//            System.out.println("i="+i+",arr[i]= "+arr[i]);
//        }


        System.out.println("after=========================");

        mergeSort4.sort(arr);
//        for (int i = 0;i<arr.length;i++){
//            System.out.println("i="+i+",arr[i]= "+arr[i]);
//        }

        System.out.println(count);

//        System.out.println(System.currentTimeMillis()-l);

    }

}
