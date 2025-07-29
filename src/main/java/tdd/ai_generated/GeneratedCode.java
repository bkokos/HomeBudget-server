
package tdd.ai_generated;

import java.util.HashMap;
import java.util.Map;

public class GeneratedCode {
    private Map<String, Boolean> invitedUsers = new HashMap<>();

    public void inviteUser(String userId) {
        invitedUsers.put(userId, true);
    }

    public boolean isUserInvited(String userId) {
        return invitedUsers.getOrDefault(userId, false);
    }
}