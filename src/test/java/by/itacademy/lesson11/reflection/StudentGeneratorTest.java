package by.itacademy.lesson11.reflection;

import by.itacademy.lesson11.reflection.domain.Student;
import by.itacademy.lesson11.reflection.generator.Generator;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class StudentGeneratorTest {
    private Generator<Student> studentGenerator = new Generator<>(Student.class);

    @Test
    public void checkObjectNotNull() {
        Student student = studentGenerator.generate();
        assertNotNull(student);
    }

    @Test
    public void checkObjectNotSame() {
        Student student1 = studentGenerator.generate();
        Student student2 = studentGenerator.generate();
        assertTrue(!(student1.equals(student2)));
    }

    @Test
    public void checkObjectNotEmpty() {
        Student student = studentGenerator.generate();
        assertNotNull(student.getName());
        assertTrue(student.getCourse() != 0);
    }

    @Test
    public void checkObjectNotOverfilled() {
        Student student = studentGenerator.generate();
        assertNull(student.getBirth());
        assertNull(student.getSurname());
    }
}
