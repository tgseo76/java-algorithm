package Ex1013.line;

import Ex1013.line.parser.Parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LineReader<T> {
    Parser<T> parser;

    public LineReader(Parser<T> parser) {
        this.parser = parser;
    }

    List<T> readLines(String filename) throws IOException {
        List<T> result = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(filename));

        String str;
        br.readLine();
        while((str=br.readLine()) != null){
            result.add(parser.parse(str));
        }
        return result;
    }

    }
