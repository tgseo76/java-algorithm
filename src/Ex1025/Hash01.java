package Ex1025;

public class Hash01 {
    public int hash(String key){
        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            int ascii=c;
            System.out.printf("%s %d\n",c,ascii);

        }
        return 0;
    }

    public static void main(String[] args) {
        Hash01 hf = new Hash01();
        hf.hash("klsd");

    }
}
