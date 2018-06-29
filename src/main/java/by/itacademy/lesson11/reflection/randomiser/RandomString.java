package by.itacademy.lesson11.reflection.randomiser;

import java.util.ArrayList;

public class RandomString implements Randomised<String> {
    private ArrayList<String> symbols = new ArrayList<>();

    {
        for (int i = 65; i < 123; i++) {
            if (i >= 91 && i <= 96) continue;
            symbols.add(String.valueOf((char) i));
        }
    }

    @Override
    public String getValue() {
        int length = (int) (Math.random() * 10 + 2);
        StringBuilder temp = new StringBuilder(length);
        for (int i = 0; i < length - 1; i++) {
            int index = (int) (Math.random() * 51 + 1);
            temp.append(symbols.get(index));
        }
        return temp.toString();
    }
}
