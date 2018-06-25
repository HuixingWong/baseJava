package athletic;

//逆序对问题求解
//使用归并排序的思想
public class ReverseCouple {


    public static int CountReverseCouple(int [] arr){

        if (arr == null || arr.length < 2){

            return 0;

        }

        return megerCount(arr,0,arr.length-1);

    }

    private static int megerCount(int[] arr, int l, int r) {

        if (l >= r){
            return 0;
        }

        int mid = l+((r-l)>>1);

        return megerCount(arr,l,mid) + megerCount(arr,mid+1,r) + merge(arr,l,mid,r);

    }

    private static int merge(int[] arr, int l, int mid, int r) {

        int [] help = new int[r-l+1];
        int p1 = l;
        int p2 = mid+1;

        int i=0;

        int count = 0;

        while (p1 <= mid && p2 <= r){

            count += arr[p1] > arr[p2] ? (mid - l +1) : 0;

            help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];

        }

        while (p1 <= mid){
            help[i++] = arr[p1++];
        }

        while (p2<= r){
            help[i++] = arr[p2++];
        }

        for (i=0;i<help.length;i++){

            arr[l+i] = help[i];

        }

        return count;


    }

    public static void main(String[] args) {

        int [] arr = new int[] {2,1,5,1};

        int i = CountReverseCouple(arr);

        System.out.println("this is th result : "+i);

        for (int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }


    }


}
