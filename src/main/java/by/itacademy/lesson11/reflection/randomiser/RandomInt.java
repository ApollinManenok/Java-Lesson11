package by.itacademy.lesson11.reflection.randomiser;

public class RandomInt implements Randomised<Integer> {
    @Override
    public Integer getValue() {
        return (int) (Math.random() * 100 + 1);
    }
}
