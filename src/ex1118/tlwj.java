package ex1118;

public class tlwj {
    public String solution(String s, int n) {
        char ss;
        String new_s="";
        n = 4;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==' '){
                new_s+=' ';
            }else {
                ss=s.charAt(i);
                if((ss+n)>=123){
                    ss+=(n-26);

                }else {
                    ss+=n;
                }
                new_s+=ss;

            }


        }
        return new_s;
    }
    public static void main(String[] args) {
        String s = "Z";
        int n = 1;
        String new_s="";
        char ss;


        for (int i = 0; i < s.length(); i++) {
            ss=s.charAt(i);
            if(ss>=97&&ss<123){//소문자일때
                if((ss+n)>=123){
                    ss+=(n-26);
                }else {
                    ss+=n;
                }
                new_s+=ss;
            }else if(ss>=65&&ss<91){ //대문자일때
                    if((ss+n)>=91){
                        ss+=(n-26);
                    }else ss+=n;
                    new_s+=ss;
            } else if (ss==' ') { //공백
                new_s+=' ';
            }
        }
        System.out.println(new_s);

    }
}
