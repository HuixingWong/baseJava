package athletic.leetcode;

public class GigtalCount {



    public  static void main(String  ... a){

        int i = digitCounts(1, 2);
        System.out.println(i);


    }


    public static int digitCounts(int k, int n) {
        // write your code here

        int count = 0;
        int base = 1;
        int flag = 1;
        if(k == 0 && n < 10){
            return 1;
        }
        if(k == 0){
            flag = 10;
        }
        while(n / base >= flag){
            int curBit = n % (base*10) / base;
            int higer = n / (base*10);
            int lower = n % base;
            if(curBit < k){
                count += base * higer;
            }else if(curBit == k){
                count += 1 + base * higer + lower;
            }else{
                count += base * (higer + 1);
            }
            base *= 10;
        }
        return count;
    }

}
