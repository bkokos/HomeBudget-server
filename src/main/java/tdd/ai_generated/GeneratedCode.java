
package tdd.ai_generated;

import java.util.HashMap;
import java.util.Map;

public class GeneratedCode {
    private Map<String, Boolean> invitedUsers = new HashMap<>();

    public void inviteUser(String userEmail) {
        invitedUsers.put(userEmail, true);
    }

    public boolean isUserInvited(String userEmail) {
        return invitedUsers.getOrDefault(userEmail, false);
    }
}