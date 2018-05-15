package athletic.offer;

public class MaxContinuousArr {

    public static void main(String[] args) {

        int [] arr = new int[]{-2,1,3,-1,2,9,-10,8,3};
        int i = maxContinus(arr);

        System.out.println(i);

    }

    public static int maxContinus(int [] arr){

        int maxcount = 0;
        int localMax = 0;

        for (int i=0;i<arr.length;i++){

            localMax += arr[i];

            if (localMax > maxcount){
                maxcount = localMax;
            }else if (localMax < 0){

                localMax = 0;
            }

        }


        return maxcount;
    }
}
