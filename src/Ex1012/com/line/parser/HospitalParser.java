package Ex1012.com.line.parser;

import Ex1012.com.line.domain.Hospital;

public class HospitalParser implements Parser<Hospital>{
    @Override
    public Hospital parse(String str) {
        String[] splitted = str.split(",");
        return new Hospital(splitted[0]+" "+splitted[3]+" "+splitted[5]);
        //splitted[0]+" "+splitted[3]+" "+splitted[5] ==>A1116520 의원 응급의료기관 이외

    }
}
