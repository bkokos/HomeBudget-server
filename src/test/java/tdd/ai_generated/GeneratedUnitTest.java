
package tdd.ai_generated;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GeneratedUnitTest {

    @Test
    void testInviteUser() {
        GeneratedCode generatedCode = new GeneratedCode();
        generatedCode.inviteUser("user123");
        assertTrue(generatedCode.isUserInvited("user123"));
    }
}