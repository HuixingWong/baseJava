package athletic;

public class QuickSort2 {



    public static void sort(Comparable [] arr){
        int n = arr.length;
        sort(arr,0,n-1);

    }

    private static void sort(Comparable[] arr, int l, int r) {


        if (l >= r){
            return;
        }

        int p = partition(arr,l,r);
        sort(arr,l,p-1);
        sort(arr,p+1,r);

    }

    private static int partition(Comparable[] arr, int l, int r) {

        Comparable v = arr[l];

        int j = l;
        for (int i=l+1;i<=r;i++)
            if (arr[i].compareTo(v) < 0) {
                j++;
                swap(arr, j, i);
            }

        swap(arr,l,j);

        return j;

    }

    private static void swap(Object[] arr, int j, int i) {

        Object temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;


    }


    // 测试 athletic.QuickSort
    public static void main(String[] args) {

        // Quick Sort也是一个O(nlogn)复杂度的算法

        Integer [] ls = new Integer[]{12,21,322,1,34,2,43,23,65,6,54,45,65,333,4,32,4,224,4,45,67};
        sort(ls);
        for (int i=0;i<ls.length;i++){
            System.out.println(ls[i]);
        }
        return;
    }


}
