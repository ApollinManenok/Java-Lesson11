package by.itacademy.lesson11.reflection.generator;

import by.itacademy.lesson11.reflection.RandomFillingException;
import by.itacademy.lesson11.reflection.domain.Generate;
import by.itacademy.lesson11.reflection.randomiser.RandomBoolean;
import by.itacademy.lesson11.reflection.randomiser.RandomDate;
import by.itacademy.lesson11.reflection.randomiser.RandomInt;
import by.itacademy.lesson11.reflection.randomiser.RandomString;
import by.itacademy.lesson11.reflection.randomiser.Randomised;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Filler<T> {
    Class<T> clazz;
    Map<String, Randomised<?>> randomiser = new HashMap<>();

    {
        randomiser.put("String", new RandomString());
        randomiser.put("Date", new RandomDate());
        randomiser.put("int", new RandomInt());
        randomiser.put("boolean", new RandomBoolean());
    }

    public Filler(Class<T> clazz) {
        this.clazz = clazz;
    }

    public void fill(T object) throws RandomFillingException {
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Generate.class)) {
                try {
                    getSetMethod(field).invoke(object, randomiser.get(field.getType().getSimpleName()).getValue());
                } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                    throw new RandomFillingException(e.getMessage());
                }
            }
        }
    }

    private Method getSetMethod(Field field) throws NoSuchMethodException {
        String methodName = field.getName();
        methodName = "set" + Character.toUpperCase(methodName.charAt(0)) + methodName.substring(1);
        return clazz.getMethod(methodName, field.getType());
    }
}
