package by.itacademy.lesson11.regexpression;

import by.itacademy.lesson11.regexpression.Compressor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompressorTest {
    private Compressor compressor = new Compressor();

    @Test
    public void checkResult() {
        assertEquals("h3e2l2o", compressor.compress("hhheello"));
        assertEquals("Hh2e2Llo", compressor.compress("HhheeLlo"));
        assertEquals("AB2A", compressor.compress("ABBA"));
    }
}
