package by.itacademy.lesson11.reflection.randomiser;

import java.util.Date;

public class RandomDate implements Randomised<Date> {
    @Override
    public Date getValue() {
        long temp = (long) (Math.random() * 1000000000 + 1) * 1000;
        return new Date(temp);
    }
}
