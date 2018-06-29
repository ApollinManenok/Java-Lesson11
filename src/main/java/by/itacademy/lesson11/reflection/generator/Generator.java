package by.itacademy.lesson11.reflection.generator;

import by.itacademy.lesson11.reflection.ExceptionHandler;
import by.itacademy.lesson11.reflection.RandomFillingException;

import java.util.logging.Level;

public class Generator<T> {
    private Class<T> clazz;

    public Generator(Class<T> clazz) {
        this.clazz = clazz;
    }

    public T generate() {
        T object = null;
        try {
            object = clazz.newInstance();
            Filler<T> filler = new Filler<>(clazz);
            filler.fill(object);
        } catch (RandomFillingException | InstantiationException | IllegalAccessException e) {
            new ExceptionHandler().handle(Level.SEVERE, "Can not create new instance", e);
        }
        return object;
    }
}
