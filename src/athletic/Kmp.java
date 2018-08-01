package athletic;

public class Kmp {



    public int [] getNextArray(char [] chars){

        int [] next  = new int[chars.length];
        next[0] = -1;
        next[1] = 0;

        return next;

    }


}
