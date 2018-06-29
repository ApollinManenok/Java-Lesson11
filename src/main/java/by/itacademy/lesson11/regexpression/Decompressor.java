package by.itacademy.lesson11.regexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Decompressor {
    public String decompress(String str) {
        Pattern pattern = Pattern.compile("(\\w)(\\d)");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            str = str.replaceFirst(pattern.pattern(), makeReplacement("$1", matcher.group(2)));
        }
        return str;
    }

    private String makeReplacement(String str, String amount) {
        String result = "";
        for (int i = 0; i < Integer.valueOf(amount); i++) {
            result += str;
        }
        return result;
    }
}
