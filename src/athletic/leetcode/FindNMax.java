package athletic.leetcode;

public class FindNMax {



    public static  int sort (int[] input,int index){
        //input=shuffle(input);
       return sort (input, 0, input.length-1,index);
    }

    public  static  int  sort(int[] input, int lowIndex, int highIndex,int findindex) {

        if (highIndex<=lowIndex)
            return lowIndex;

        int lt=lowIndex;
        int gt=highIndex;
        int i=lowIndex+1;

        int pivotIndex=lowIndex;
        int pivotValue=input[pivotIndex];

        while (i<=gt){

            if (less(input[i],pivotValue)){
                exchange(input, i++, lt++);
            }
            else if (less (pivotValue, input[i])){
                exchange(input, i, gt--);
            }
            else{
                i++;
            }

        }

        if (lowIndex == findindex){
            return input[findindex];
        }
        if (lowIndex > findindex){
           return  sort (input, lowIndex, lt-1,findindex);
        }else {
          return   sort (input, gt+1, highIndex,findindex-lowIndex);
        }



    }

    private static boolean less(int i, int i1) {

        if (i<i1){
            return true;
        }

        return false;

    }

    private static void exchange(int[] input, int pivotIndex, int j) {

        int t = input[pivotIndex];
        input[pivotIndex] = input[j];
        input[j] = t;
    }


    public static void main(String ... a){

        int [] ls = new int[]{2,5,3,4,9,1,12,34};

        int sort = sort(ls, 3);

        System.out.println(sort);


    }


}
