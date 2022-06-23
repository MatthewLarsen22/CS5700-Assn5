package Tests;

import Detectors.BinaryDetector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryDetectorTest {
    public BinaryDetectorTest(){
        testBinaryDetector();
    }

    @Test
    public void testBinaryDetector(){
        BinaryDetector binaryDetector = new BinaryDetector();

        assertEquals(true, binaryDetector.detect("1"));
        assertEquals(true, binaryDetector.detect("11"));
        assertEquals(true, binaryDetector.detect("101"));
        assertEquals(true, binaryDetector.detect("111111"));
        assertEquals(true, binaryDetector.detect("10011010001"));

        assertEquals(false, binaryDetector.detect(""));
        assertEquals(false, binaryDetector.detect("01"));
        assertEquals(false, binaryDetector.detect("10"));
        assertEquals(false, binaryDetector.detect("1000010"));
        assertEquals(false, binaryDetector.detect("100a01"));
    }
}
