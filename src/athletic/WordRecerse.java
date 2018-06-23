package athletic;

public class WordRecerse {


    public static void main(String[] args) {

        String str = "what a fucking u";
        String reserve = reserve(str);
        System.out.println(reserve);

    }


    public static String detail(String  str){

        char[] chars = str.toCharArray();
        for (int i = 0;i<chars.length/2;i++){

            swap(chars,i,chars.length - 1-i);

        }

        return String.valueOf(chars);

    }


    public static String reserve(String str){


        String[] split = detail(str).split(" ");

        String result = "";
        for (String  s:split
             ) {

            result += detail(s)+" ";

        }

        return result;


    }

    public static void swap(char[] chars,int i ,int j){

        char t = chars[i];
        chars[i] = chars[j];
        chars[j] = t;

    }


}
