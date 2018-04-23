package athletic.leetcode;

public class Waterpool {


    //n是数组的长度
    public static int findPoor(int [] arr,int n){

        int l = 0,r = n;

        int max = arr[0] < arr[n] ? arr[0] * n : arr[n]*n;

        while (l < r){

            if (arr[l] > arr[r]){

                r--;

            }else {

                l++;

            }

            int area = arr[l] < arr[r] ? arr[l] * (r-l) : arr[r]*(r-l);

            if (area > max){
                max = area;
            }


        }

        return max;
    }


    public static void main(String ... a){

        int [] ls = new int[]{1,2,5,5,5,5,5,10000,0,2,4,5,10000};
        int poor = findPoor(ls, ls.length - 1);

        System.out.println(poor);

    }


}
