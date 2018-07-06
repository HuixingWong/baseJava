package athletic.list;

import java.util.HashMap;

//实现setall功能的map，哈希表。
//使用时间戳来实现，每个值持有一个时间

public class SetAllHashMap {

    public static class MyValue<V>{

        private V value;
        private long time;

        public MyValue(V value,long time){


            this.value = value;
            this.time = time;

        }

        public  V getValue(){

            return this.value;

        }

        public long getTime(){
            return this.time;
        }

    }


    public static class MyHashMap<K,V>{


        private HashMap<K,MyValue<V>> basemap;
        private long time;
        private MyValue<V> setall;

        public MyHashMap(){

            this.basemap = new  HashMap<K,MyValue<V>>();
            this.time = 0;
            this.setall = new MyValue<>(null,-1);

        }

        public boolean constainskey(K key){

            return this.basemap.containsKey(key);

        }

        public void put(K key,V value){

            this.basemap.put(key,new MyValue<>(value,this.time++));

        }

        public void setAll(V value){

            this.setall = new MyValue<>(value,this.time++);

        }

        public V get(K key){

            if (this.constainskey(key)){

                if (this.basemap.get(key).time > this.setall.time){
                    return this.basemap.get(key).getValue();
                }else {
                    return this.setall.getValue();
                }

            }else {
                return null;
            }

        }

    }


    public static void main(String[] args) {

        MyHashMap<Integer,String> map = new MyHashMap<>();
        map.put(1,"erhuo");
        map.put(2,"haoren");
        map.put(3,"liunin");
        map.put(4,"lll");
        map.put(5,"wawa");

        System.out.println(map.get(1));
        map.setAll("fuck");

        System.out.println(map.get(4));

    }



}
