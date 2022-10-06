package Ex1006;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ReadFile {
    public static void main(String[] args) throws IOException {

        File dir = new File("./");
        File files[] = dir.listFiles();
            for(int i=0;i<files.length;i++){
                System.out.println(files[i]);

/*
.\.git
.\.gitignore
.\.idea
.\a_file.txt
.\java-push-ex.iml
.\out
.\src
*/
            }
    }
}
