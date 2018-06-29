package by.itacademy.lesson11.reflection;

import by.itacademy.lesson11.reflection.domain.Sculpture;
import by.itacademy.lesson11.reflection.domain.Student;
import by.itacademy.lesson11.reflection.generator.Generator;

public class Main {
    public static void main(String[] args) {
        Sculpture sculpture = new Generator<Sculpture>(Sculpture.class).generate();
        Generator<Student> StudentGenerator = new Generator<>(Student.class);
        Student student1 = StudentGenerator.generate();
        Student student2 = StudentGenerator.generate();
        System.out.println(sculpture);
        System.out.println(student1);
        System.out.println(student2);
    }
}
