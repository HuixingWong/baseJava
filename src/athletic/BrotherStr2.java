package athletic;

public class BrotherStr2 {


    public static boolean isBrotherStr(String str1,String str2){


        if (str1 == null || str2 == null || str1.length() != str2.length()){

            return false;

        }

        char[] chars = str1.toCharArray();
        char[] chars1 = str2.toCharArray();
        int [] record = new int[256];

        for (int i=0;i<chars.length;i++){

            record[chars[i]]++;

        }

        for (int i =0;i<chars1.length;i++){

            if (record[chars1[i]]-- == 0){
                return false;
            }

        }

        return true;

    }


    public static void main(String[] args) {

        System.out.println(isBrotherStr("edcvfrtgb","ertdfgcvb"));

    }

}
