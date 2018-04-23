package athletic.leetcode;

public class MostLongRepeat {



    public long getZero(Long n){

        long count = 0;
        while (n!=0){
            count +=n/5;
            n /= 5;
        }
        return count;

    }


}
