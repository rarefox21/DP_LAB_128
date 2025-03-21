import org.junit.Test;

public class MotionDetectorTest {

    @Test
    public void test() {
        // Given
        MotionDetector motionDetector = new MotionDetector();

        // When
        boolean result = motionDetector.isThereMotion();

        // Then
        assertTrue(result);
    }

    private void assertTrue(boolean result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
