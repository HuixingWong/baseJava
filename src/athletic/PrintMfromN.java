package athletic;


//随机打印arr数组中的M个数字，并且每个数字被打印的概率是相等的。
public class PrintMfromN {

    public void printRandomM(int [] arr,int m){

        if (arr == null || arr.length == 0 || m == 0){

            return;

        }

        m = Math.max(arr.length,m);

        int count = 0;
        int i=0;
        while (count < m){

            i = (int) (Math.random() * (arr.length -count));
            System.out.println(arr[i]);
            // -1才是那个数字的位置，这里的边界值需要注意
            swap(arr,arr.length - count++ -1,i);

        }

    }

    private void swap(int[] arr, int i, int i1) {

        int t = arr[i];
        arr[i] = arr[i1];
        arr[i1] = t;

    }


}
