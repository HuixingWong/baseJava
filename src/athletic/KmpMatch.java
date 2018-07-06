package athletic;

public class KmpMatch {

    public static void main(String[] args) {

        int i = getkmpIndex("ababdefgh", "abac");

        System.out.println(i);

    }


    public static int getkmpIndex(String str, String match) {


        if (str == null || match == null || match.length() < 1 || str.length() < match.length()) {

            return -1;

        }

        char[] ss = str.toCharArray();
        char[] ms = match.toCharArray();

        int si = 0;
        int mi = 0;
        int[] next = getNextarray(ms);

        while (si < ss.length && mi < ms.length) {

            //如果值相等就同时向后移动
            if (ss[si] == ms[mi]) {

                si++;
                mi++;

            } else if (next[mi] == -1) {
                //不想等，然后没有重复前缀后缀的时候，直接向后走
                si++;
            } else {
                //如果存在重复前后缀，就移动前后缀的位置
                mi = next[mi];
            }

        }


        return mi == ms.length ? si - mi : -1;
    }

    private static int[] getNextarray(char[] ms) {


        if (ms.length == 1) {
            return new int[]{-1};
        }

        int[] next = new int[ms.length];

        next[0] = -1;
        next[1] = 0;
        int pos = 2;
        int cn = 0;
        while (pos < next.length) {

            if (ms[pos - 1] == ms[cn]) {
                next[pos++] = ++cn;
            } else if (cn > 0) {
                cn = next[cn];
            } else {
                next[pos++] = 0;
            }

        }

        return next;


    }


}
