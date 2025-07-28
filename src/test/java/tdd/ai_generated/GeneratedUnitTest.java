
package tdd.ai_generated;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GeneratedUnitTest {

    @Test
    void testGetAppointmentsForToday() {
        GeneratedCode generatedCode = new GeneratedCode();
        String result = generatedCode.getAppointmentsForToday();
        assertEquals("Appointment list for today", result);
    }
}