package Ex1013.line;

import Ex1013.line.domain.Hospital;
import Ex1013.line.parser.HospitalParser;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        LineReader<Hospital> hospitalLineReader = new LineReader<>(new HospitalParser());
        String filename = "C:\\Users\\tjxor\\Desktop\\서울시 병의원 위치 정보.csv";
        List<Hospital> hospitals = hospitalLineReader.readLines(filename);
        File file = new File("./test.txt");
        for (Hospital hospital: hospitals) {
            file.createNewFile();
        }

    }
}
