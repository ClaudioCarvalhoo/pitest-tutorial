package project;

import org.junit.Test;
import org.junit.Assert;

public class DetectorTest {

    Detector detector = new Detector();

    @Test
    public void testFalse() {
        Assert.assertEquals(detector.isSevenAndFour(2, 3), false);
    }

    @Test
    public void testTrue() {
        Assert.assertEquals(detector.isSevenAndFour(7, 4), true);
    }

    // @Test
    // public void testTrueInversed() {
    //     Assert.assertEquals(detector.isSevenAndFour(4, 7), true);
    // }
    
}
