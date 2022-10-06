package Ex1006;

public class AlphabetCnt {
    public static void main(String[] args) {
        String s1 = "aabbcdd153hdi";
        //string 한글자씩 출력 charAt
        boolean isAlpha;

        char ch;
        int chk;

        for (int i=0;i<s1.length();i++){
            ch=s1.charAt(i);;
            chk=(int)ch;
            if((chk>=65 && chk<=90) || (chk>=97 && chk<=122) ){
                System.out.println("알파벳입니다");
            }else {
                System.out.println("알파벳이 아닙니다.");
            }
        }



    }
}
