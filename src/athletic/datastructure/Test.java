package athletic.datastructure;

import java.util.Collection;
import java.util.Iterator;

public class Test {

    public static <AnyType> void print(Collection<AnyType> collection){

        for (AnyType item:collection
             ) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {




    }

    class  A implements Iterator {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    }


}
