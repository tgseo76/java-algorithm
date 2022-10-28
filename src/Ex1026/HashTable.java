package Ex1026;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashTable {
    class Node{
        private String key;
        private Integer value;

        public Node(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public Integer getValue() {
            return value;
        }
    }

    private int size=10000;
        List<Node>[] table = new ArrayList[size];

    public HashTable() {
    }

    public HashTable(int size) {

        this.size = size;
        this.table=new ArrayList[size];
    }

    public int hash(String str) {
        int ascii=0;
        for (int i = 0; i < str.length(); i++) {
            ascii+=str.charAt(i);
        }
        return (ascii % this.size);
    }


    public void insert(String key,int value){
//        int hashCode = hash(key);
        int hashIdx = hash(key);
        if(this.table[hashIdx]==null){ // null 일대 생성
            this.table[hashIdx]= new ArrayList<>();
        }
        //map , object
        this.table[hashIdx].add(new Node(key,value));
//        this.table[hashCode]=value;
//        System.out.println(key+" "+hashCode+"방에 저장이 완료되었습니다.");

    }

    public Integer get(String key){
        List<Node> nodes = this.table[hash(key)];
        for (Node node:nodes) {
            if(key.equals(node.getKey())){
                return node.value;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashTable hf = new HashTable(10000);
//        String[] names = new String[]{"DongyeonKang","SubinKang", "KwanwunKo", "HyunseokKo", "KyoungdukKoo", "YeonjiGu", "SoyeonKown", "OhsukKwon", "GunwooKim", "KiheonKim", "NayeongKim", "DohyeonKim", "MinkyoungKim", "MinjiKim", "SanghoKim", "SolbaeKim", "YejinKim", "EungjunKim", "JaegeunKim", "JeonghyeonKim", "JunhoKim", "JisuKim", "kimjinah", "HaneulKim", "HeejungKim", "KimoonPark", "EunbinPark", "JeongHoonPark", "JeminPark", "TaegeunPark", "JiwonBae", "SeunggeunBaek", "JihwanByeon", "HeungseopByeon", "JeongHeeSeo", "TaegeonSeo", "SeeYunSeok", "SuyeonSeong", "SeyoelSon", "MinjiSong", "JinwooSong"};
        hf.insert("Yoonseo",1);
        hf.insert("Seoyoon",2);

        int result = hf.get("Yoonseo");

        if(result==1){
            System.out.println("테스트성공");
        }else {
            System.out.printf("실패 value: %d",result);
        }
    }
}
