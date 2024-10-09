package org.project.session_manager.sessionmanagers.Model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@NoArgsConstructor
public class User {
    String role;
    String userId;
    String sessionId;

    public User(String role, String userId, String sessionId) {
        this.role = role;
        this.userId = userId;
        this.sessionId = sessionId;
    }
}
