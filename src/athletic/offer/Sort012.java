package athletic.offer;

public class Sort012 {


    public static int[] sort(int[] arr) {

        int i = 0, j = arr.length - 1;
        int index = 0;
        while (index < j) {

            if (arr[index] != 1) {

                if (arr[index] == 0 && index != i) {
                    swap(arr,i,index);
                    i++;
                }else if (arr[index] == 2 && index != j){
                    swap(arr,j,index);
                    j--;
                }

            }

            if (arr[index] == 1 || index == i){
                index ++;
            }

        }

        return arr;

    }


    public static void main(String[] args) {

        int [] arr = new int[]{2,2,2,2,1,0,0,2,1,2,2,2,0,1,1,2,1,1,2,2,2,1,1,0,1,2,0,0,0,0};

        sort(arr);

        for (int i:arr
             ) {
            System.out.println(i);
        }


    }

    public static void swap(int[] arr, int a, int b) {

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }

}
