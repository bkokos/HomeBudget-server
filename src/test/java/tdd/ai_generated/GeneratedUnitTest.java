
package tdd.ai_generated;

import com.homebudget.user.service.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;

class GeneratedUnitTest {

    @Test
    void testInviteUserExistingUser() {
        UserRepository userRepository = Mockito.mock(UserRepository.class);
        GeneratedCode generatedCode = new GeneratedCode();
        generatedCode.setUserRepository(userRepository);

        // Set up mock behavior for the repository
        Mockito.when(userRepository.findUserByNick("testNick")).thenReturn(new com.homebudget.user.entity.User());

        // Call the method under test
        generatedCode.inviteUser("testNick");

        // Verify that the expected interactions occurred
        Mockito.verify(userRepository).findUserByNick("testNick");
    }

    @Test
    void testInviteUserNonExistingUser() {
        UserRepository userRepository = Mockito.mock(UserRepository.class);
        GeneratedCode generatedCode = new GeneratedCode();
        generatedCode.setUserRepository(userRepository);

        // Set up mock behavior for the repository
        Mockito.when(userRepository.findUserByNick("nonExistentNick")).thenReturn(null);

        // Call the method under test
        generatedCode.inviteUser("nonExistentNick");

        // Verify that the expected interactions occurred
        Mockito.verify(userRepository).findUserByNick("nonExistentNick");
    }

    @Test
    void testInviteUserNullNick() {
        UserRepository userRepository = Mockito.mock(UserRepository.class);
        GeneratedCode generatedCode = new GeneratedCode();
        generatedCode.setUserRepository(userRepository);

        // Call the method under test (should throw an exception)
        assertThrows(IllegalArgumentException.class, () -> generatedCode.inviteUser(null));
    }

    @Test
    void testInviteUserEmptyNick() {
        UserRepository userRepository = Mockito.mock(UserRepository.class);
        GeneratedCode generatedCode = new GeneratedCode();
        generatedCode.setUserRepository(userRepository);

        // Call the method under test (should throw an exception)
        assertThrows(IllegalArgumentException.class, () -> generatedCode.inviteUser(""));
    }
}