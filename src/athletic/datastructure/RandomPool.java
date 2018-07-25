package athletic.datastructure;

import java.util.HashMap;

public class RandomPool {


    public static class Pool<K> {

        private HashMap<K, Integer> KeyIndexMap;
        private HashMap<Integer, K> IndexKeyMap;

        private int size;

        public Pool() {

            KeyIndexMap = new HashMap<>();
            IndexKeyMap = new HashMap<>();
            size = 0;

        }


        public void add(K key) {
            KeyIndexMap.put(key, size);
            IndexKeyMap.put(size, key);
            size++;
        }


        public K getRandom() {

            if (size == 0) {
                return null;
            }

            int index = (int) (Math.random() * size);
            return IndexKeyMap.get(index);

        }


        public void remove(K k) {

            if (!KeyIndexMap.containsKey(k) && size == 0) {
                return;
            }

            int index = KeyIndexMap.get(k);

            K k1 = IndexKeyMap.get(size-1);

            IndexKeyMap.put(index, k1);
            IndexKeyMap.remove(size-1);



            KeyIndexMap.put(k1,index);
            KeyIndexMap.remove(k);



            size -- ;

        }


    }


    public static void main(String[] args) {


        Pool<String> pool = new Pool();

        pool.add("a");
        pool.add("b");
        pool.add("c");
        pool.add("d");
        pool.add("e");

        System.out.println(pool.size);
        pool.remove("a");

        System.out.println(pool.size);

        System.out.println(pool.IndexKeyMap.size());
        System.out.println(pool.KeyIndexMap.size());

        pool.remove("b");
        pool.remove("c");
        pool.remove("d");
        pool.remove("e");

        System.out.println("this is gap =============");
        System.out.println(pool.size);
        System.out.println(pool.IndexKeyMap.size());
        System.out.println(pool.KeyIndexMap.size());



    }


}
