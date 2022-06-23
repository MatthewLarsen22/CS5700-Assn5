package Tests;

import Detectors.IntegerDetector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegerDetectorTest {
    @Test
    public void testIntegerDetector(){
        IntegerDetector integerDetector = new IntegerDetector();

        assertEquals(true, integerDetector.detect("1"));
        assertEquals(true, integerDetector.detect("123"));
        assertEquals(true, integerDetector.detect("3452342352434534524346"));

        assertEquals(false, integerDetector.detect(""));
        assertEquals(false, integerDetector.detect("0123"));
        assertEquals(false, integerDetector.detect("132a"));
        assertEquals(false, integerDetector.detect("0"));
        assertEquals(false, integerDetector.detect("-12"));
        assertEquals(false, integerDetector.detect("6.0"));
    }
}
