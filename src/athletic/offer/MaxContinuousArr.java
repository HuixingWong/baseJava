package athletic.offer;

public class MaxContinuousArr {

    public static void main(String[] args) {

        int [] arr = new int[]{-2,-3,-5,1,3,-1,2,9,-10,8,3,-4,-5,20};
        int i = maxContinus(arr);

        System.out.println("求的最大值为："+i);

    }

    public static int maxContinus(int [] arr){

        int maxcount = 0;
        int localMax = 0;

        //开始位置，如果需要的话
        int endposition = 0;
        //结束位置，如果需要的话
        int startposition = 0;

        for (int i=0;i<arr.length;i++){

            localMax += arr[i];

            if (localMax > maxcount){
                maxcount = localMax;
                endposition = i;
            }else if (localMax < 0){
                localMax = 0;
                startposition = i+1;
            }

        }

        System.out.println("从这个位置开始："+startposition);
        System.out.println("到这个位置："+endposition);


        return maxcount;
    }
}
