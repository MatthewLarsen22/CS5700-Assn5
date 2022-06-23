package Tests;

import Detectors.EmailDetector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmailDetectorTest {
    public EmailDetectorTest(){
        testEmailDetector();
    }

    @Test
    public void testEmailDetector(){
        EmailDetector emailDetector = new EmailDetector();

        assertEquals(true, emailDetector.detect("a@b.c"));
        assertEquals(true, emailDetector.detect("joseph.ditton@usu.edu"));
        assertEquals(true, emailDetector.detect("{}*$.&$*(@*$%&.*&*"));
        assertEquals(true, emailDetector.detect("matt4.0larsen@gmail.com"));

        assertEquals(false, emailDetector.detect(""));
        assertEquals(false, emailDetector.detect("@b.c"));
        assertEquals(false, emailDetector.detect("a@b@c.com"));
        assertEquals(false, emailDetector.detect("a.b@b.b.c"));
        assertEquals(false, emailDetector.detect("joseph ditton@usu.edu"));
        assertEquals(false, emailDetector.detect("matt4.0larsen@gmail.com."));
    }
}
