package Ex1006;

import java.util.List;

public class ListExMain {
    public static void main(String[] args) {
        ListEx listEx = new ListEx();

        List<String> students = listEx.getStudents();

        for (String student:students) {
            System.out.println(student);
        }
    }
}
