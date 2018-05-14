package athletic.offer;

import java.util.ArrayList;
import java.util.List;

public class ScrollWindow {


    public static void main(String[] args) {




    }

    private static void init(List<Integer> list,int a,int b,int c){

        list.add(a);
        list.add(b);
        list.add(c);

    }

    public static int [] scroll(int [] arr,int windowSize){

        int[] ls = new int[windowSize - 2];

        if (arr.length < windowSize){
            return ls;
        }

        List<Integer> list = new ArrayList();

        if (arr[0]> arr[1]){

            if (arr[0] > arr[2]){
                init(list,arr[0],arr[1],arr[2]);
            }else {
                init(list,arr[2],arr[1],arr[0]);
            }

        }else {

            if (arr[1] > arr[2]){
                init(list,arr[1],arr[0],arr[2]);

            }else {

                init(list,arr[2],arr[1],arr[0]);

            }

        }

        ls[0] = list.get(0);

        for (int i=3;i<windowSize;i++){

            if (list.get(0) < arr[i]){

                list.remove(0);
                list.add(0,arr[i]);

            }

        }




        return ls;
    }

}
