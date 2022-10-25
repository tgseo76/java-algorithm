package Ex1025;

import java.util.Arrays;

public class HashEx {
    int[] table = new int[10000];

    public int hash(String str){
        int ascii=0;
        for (int i = 0; i < str.length(); i++) {
            ascii+=str.charAt(i);

        }
        return ascii%1000;
    }

    public void insert(String key,int value){
        table[hash(key)]=value;
    }

    public int get(String key){
        return table[hash(key)];
    }

    public static void main(String[] args) {
        HashEx hf = new HashEx();
        hf.insert("kedfs",10);
        hf.insert("kesd123fs",5);

            System.out.println(Arrays.toString(hf.table));



    }
}
