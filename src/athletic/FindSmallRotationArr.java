package athletic;

public class FindSmallRotationArr {


    public static int getSmall(int [] arr,int low,int high){


        if (arr == null || arr.length == 0){
            return  -1;
        }

        if (arr[low] <= arr[high]){

            return arr[low];
        }

        int mid = (low+high)/2;

        if (arr[low] > arr[mid]){

            return getSmall(arr,low,mid);
        }else {
            return getSmall(arr,mid,high);
        }

    }

    public static void main(String[] args) {


        int[] ints = {3, 4, 5, 6, 7, 1, 2};

        System.out.println(getSmall(ints,0,ints.length-1));

    }


}
