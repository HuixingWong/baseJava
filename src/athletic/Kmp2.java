package athletic;

public class Kmp2 {



    public static int getKmpIndex(String str,String match){

        if (str == null || match == null ||
                match.length() <1 || match.length() < str.length()) {

            return -1;

        }

        char[] ss = str.toCharArray();
        char[] ms = match.toCharArray();

        int si = 0;
        int mi = 0;
        int [] next = getNextarray(ms);

        while (si < ss.length && mi < ms.length){

            if (ss[si] == ms[mi]){
                si++;
                mi++;
            }else if (next[mi] == -1){
                si++;
            }else {
                mi = next[mi];
            }

        }



        return mi == ms.length ? si-mi : -1;
    }


    public static int [] getNextarray(char [] ms ){

        if (ms.length == 1){
            return new int[]{-1};
        }

        int [] next = new int[ms.length];
        next[0] = -1;
        next[1] = 0;
        int pos = 2;
        int cn = 0;

        while (pos < next.length){

            if (ms[pos-1] == ms[cn]){

                next[pos++] = ++cn;
            }else if (cn > 0){
                cn = next[cn];
            }else {
                next[pos++] = 0;
            }

        }

        return next;

    }


}
