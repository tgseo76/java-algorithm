package Ex1006;

public class RanNumEx implements NumGen{
    @Override
    public int gen(int num) {
        return (int)(Math.random()*num);
    }
}

