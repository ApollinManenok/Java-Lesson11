package by.itacademy.lesson11.reflection.randomiser;

public class RandomBoolean implements Randomised<Boolean> {
    @Override
    public Boolean getValue() {
        return ((int) (Math.random() * 2) == 1) ? (Boolean.TRUE) : (Boolean.FALSE);
    }
}
