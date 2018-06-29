package by.itacademy.lesson11.regexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Compressor {
    public String compress(String str) {
        Pattern pattern = Pattern.compile("([\\w])\\1+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            str = str.replaceFirst(pattern.pattern(), "$1" + matcher.group().length());
        }
        return str;
    }
}
