package athletic.leetcode;

import java.util.HashMap;
import java.util.Map;

public class theSceond {

  static String str =  "1234567890049203424234534545634353636463453453";

    public static int getMostLongString(String str){

        Map<Character,Integer> charPosition = new HashMap<>();

        //到达每一个位置时候已经出现的最长字符串的长度记录
        int [] prearr = new int[str.length()];

        char[] chars = str.toCharArray();

        for (int i=0;i<chars.length;i++){

            Integer lastposition = charPosition.get(chars[i]);
            /**
             * 说明是第一次出现
             */
            if (lastposition == null){

                prearr[i] = i==0 ? 1:prearr[i-1]+1;


            }else {
                //说明已经出现过
                int apos = lastposition;
                int unRepeat = prearr[i-1];
                int bpos = i-unRepeat;

                if (apos >= bpos){

                    prearr[i] = i-apos;

                }else {

                    prearr[i] = i-bpos+1;

                }

            }

            charPosition.put(chars[i],i);
        }
        int max = prearr[0];
        for (int i= 0;i<prearr.length;i++){

            if (prearr[i] > max){
                max = prearr[i];
            }

        }


        return max;
    }


    public static void main(String ... a){


        int mostLongString = getMostLongString(str);

        System.out.println(mostLongString);


    }
}
