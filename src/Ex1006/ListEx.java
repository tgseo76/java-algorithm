package Ex1006;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    List<String> students = new ArrayList<>();

    ListEx(){
        //print(st)
        this.students.add("김경록");
        this.students.add("김미지");
        this.students.add("김민경");
        this.students.add("김민지");
    }

    List<String> getStudents(){
        return this.students;
    }

}
