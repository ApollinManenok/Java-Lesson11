package by.itacademy.lesson11.reflection;

import by.itacademy.lesson11.reflection.domain.Sculpture;
import by.itacademy.lesson11.reflection.generator.Generator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class SculptureGeneratorTest {
    private Generator<Sculpture> sculptureGenerator = new Generator<>(Sculpture.class);

    @Test
    public void checkObjectNotNull() {
        Sculpture sculpture = sculptureGenerator.generate();
        assertNotNull(sculpture);
    }

    @Test
    public void checkObjectNotSame() {
        Sculpture sculpture1 = sculptureGenerator.generate();
        Sculpture sculpture2 = sculptureGenerator.generate();
        assertTrue(!(sculpture1.equals(sculpture2)));
    }

    @Test
    public void checkObjectNotEmpty() {
        Sculpture sculpture = sculptureGenerator.generate();
        assertNotNull(sculpture.getName());
        assertNotNull(sculpture.getCompleted());
    }

    @Test
    public void checkObjectNotOverfilled() {
        Sculpture sculpture = sculptureGenerator.generate();
        assertEquals(0, sculpture.getSize());
        assertTrue(!sculpture.isSold());
        assertNull(sculpture.getAuthor());
    }
}

