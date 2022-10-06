package Ex1006;

public class RanNumExMain {
    public static void main(String[] args) {
        RanNumEx ranNumEx=new RanNumEx();

        for(int i=0;i<50;i++){
            int r = ranNumEx.gen(20);
            System.out.println(r);
        }


    }
}
