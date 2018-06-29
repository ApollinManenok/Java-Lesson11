package by.itacademy.lesson11.regexpression;

import by.itacademy.lesson11.regexpression.Decompressor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecompressorTest {
    private Decompressor decompressor = new Decompressor();

    @Test
    public void checkResult() {
        assertEquals("hhheello", decompressor.decompress("h3e2l2o"));
        assertEquals("HhheeLlo", decompressor.decompress("HhheeLlo"));
        assertEquals("ABBA", decompressor.decompress("ABBA"));
    }
}
