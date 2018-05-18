package athletic.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shaizi {
//    扔 n 个骰子，向上面的数字之和为 S。给定 Given n，请列出所有可能的 S 值及其相应的概率。


    public static List<Map.Entry<Integer, Integer>> dicesSum(int n) {


       List<Map> list = new ArrayList<>();

        int allGroup = (int) Math.pow(6,n);

        System.out.println(allGroup);


        for (int i=n;i<n*6;i++){
            Map<Integer,Integer> map = new HashMap<>();
            
            if (i == n || i == n*6){
                
                map.put(i,1);
                
            }else if (i == n+1){
                
                map.put(i,n);
                
            }else {

                countN(n,i);
                
            }

            map.put(i,0);

            list.add(map);

        }
        
        



        return null;
    }
    
    public static int countN(int n,int sum){
        
        if (n == 1 || sum == 1){
            return 1;
        }

        return countN(n-1,sum -1)+countN(n,sum-1);
        
    }

    public static void main(String[] args) {


        List<Map.Entry<Integer, Integer>> entries = dicesSum(2);

        for (Map.Entry<Integer, Integer> map: entries
             ) {


            System.out.println(map.getKey()+"  : "+map.getValue());

        }


    }

}
