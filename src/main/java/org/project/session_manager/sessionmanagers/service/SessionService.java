package org.project.session_manager.sessionmanagers.service;

import lombok.NoArgsConstructor;
import org.project.session_manager.sessionmanagers.Model.User;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentHashMap;

@Service
public class SessionService {
    private ConcurrentHashMap<String, User> sessionMap;

    public SessionService() {
        this.sessionMap = new ConcurrentHashMap<>();
    }

    public  void setSession(User user) {
        sessionMap.put(user.getSessionId(), user);
    }

    public  User getSession(String sessionId) {
        return sessionMap.get(sessionId);
    }
    public  void removeSession(String sessionId) {
        sessionMap.remove(sessionId);
    }



}
