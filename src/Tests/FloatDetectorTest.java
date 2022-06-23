package Tests;

import Detectors.FloatDetector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FloatDetectorTest {
    @Test
    public void testFloatDetector(){
        FloatDetector floatDetector = new FloatDetector();

        assertEquals(true, floatDetector.detect("1.0"));
        assertEquals(true, floatDetector.detect("123.34"));
        assertEquals(true, floatDetector.detect("0.200000"));
        assertEquals(true, floatDetector.detect("12349871234.12340981234098"));
        assertEquals(true, floatDetector.detect(".123"));

        assertEquals(false, floatDetector.detect(""));
        assertEquals(false, floatDetector.detect("123"));
        assertEquals(false, floatDetector.detect("123.123."));
        assertEquals(false, floatDetector.detect("123.02a"));
        assertEquals(false, floatDetector.detect("123."));
        assertEquals(false, floatDetector.detect("012.4"));
    }
}
