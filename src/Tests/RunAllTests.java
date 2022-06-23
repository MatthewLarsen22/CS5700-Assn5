package Tests;

import Detectors.EmailDetector;
import Detectors.IntegerDetector;
import org.junit.jupiter.api.Test;

public class RunAllTests {

    @Test
    public void runTests(){
        new IntegerDetectorTest();
        new FloatDetectorTest();
        new BinaryDetectorTest();
        new EmailDetectorTest();
        new PasswordDetectorTest();
    }
}
