package Tests;

import Detectors.PasswordDetector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordDetectorTest {
    public PasswordDetectorTest(){
        testPasswordDetector();
    }

    @Test
    public void testPasswordDetector(){
        PasswordDetector passwordDetector = new PasswordDetector();

        assertEquals(true, passwordDetector.detect("aaaaH!aa"));
        assertEquals(true, passwordDetector.detect("1234567*9J"));

        assertEquals(false, passwordDetector.detect(""));
        assertEquals(false, passwordDetector.detect("a"));
        assertEquals(false, passwordDetector.detect("aaaH!aa"));
        assertEquals(false, passwordDetector.detect("aaaaaaa!"));
        assertEquals(false, passwordDetector.detect("aaaHaaaaa"));
        assertEquals(false, passwordDetector.detect("Abbbbbbb!"));
    }
}
