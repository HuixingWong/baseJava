package athletic;

public class SmallSum {

    public static  int mergeSmallSum(int [] arr){

        if (arr == null || arr.length < 2){
            return  0;
        }

        return mergeSort(arr,0,arr.length -1);

    }

    private static int mergeSort(int[] arr, int l, int r) {

        if (l >= r){
            return  0;
        }

        int mid = l + ((r-l) >> 1);

        return mergeSort(arr,l,mid) + mergeSort(arr,mid+1,r) + merge(arr,l,mid,r);


    }

    private static int merge(int[] arr, int l, int mid, int r) {

        int [] help = new int[r-l+1];

        int p1 = l;
        int p2 = mid+1;
        int i=0;

        int result = 0;

        //这里出错，p1因该是小于mid继续而不是小于l，细心一点就不会错了
        while (p1 <= mid && p2 <= r){

            result += arr[p1] < arr[p2] ? arr[p1] * (r-p2+1) : 0;

            help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];


        }

        while (p1 <= mid){

            help[i++] = arr[p1++];

        }

        while (p2 <= r){

            help[i++] = arr[p2++];

        }

        for (i=0;i<help.length;i++){

            arr[l+i] = help[i];

        }

        return result;

    }

    public static void main(String[] args) {


        int [] arr  = new int[]{4,1,4,45,6,3,2,53,45};

        int i = mergeSmallSum(arr);

        System.out.println(i);

        for (int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }


}
