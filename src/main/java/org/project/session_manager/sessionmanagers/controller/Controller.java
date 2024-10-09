package org.project.session_manager.sessionmanagers.controller;


import org.project.session_manager.sessionmanagers.Model.User;
import org.project.session_manager.sessionmanagers.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/session")
public class Controller {


    SessionService sessionService;

    @Autowired
    Controller(SessionService sessionService) {
        this.sessionService = sessionService;
    }

    @PostMapping()
    public ResponseEntity<String> createSession(@RequestBody  User user) {
        try {

            if (user.getSessionId() != null && user.getUserId() != null &&  user.getRole() != null) {
                sessionService.setSession(user);
                return  ResponseEntity.status(200).body("Session created");
            }else{
                return  ResponseEntity.status(400).body("Specify complete date");
            }

        }catch (Exception e) {

            return  ResponseEntity.status(500).body("Session could not be created");
        }

    }



    @GetMapping("/{session_id}")
    public ResponseEntity<User> getSession(@PathVariable(name = "session_id") String sessionId) {

        if(sessionId.isEmpty()) {
            return ResponseEntity.status(400).body(null);
        }else{
        try {
            if(sessionService.getSession(sessionId) != null) {
                return  ResponseEntity.status(200).body(sessionService.getSession(sessionId));
            }else{
                return  ResponseEntity.status(404).body(null);
            }
        }catch (Exception e) {
            return  ResponseEntity.status(500).body(null);
        }

        }
    }


    @DeleteMapping("/{session_id}")
    public ResponseEntity<String> deleteSession(@PathVariable(name = "session_id") String sessionId) {
        if(sessionId.isEmpty()) {
            return ResponseEntity.status(400).body("Session id cannot be empty");
        }
        else{
            try{
                if(sessionService.getSession(sessionId) != null) {
                    sessionService.removeSession(sessionId);
                    return  ResponseEntity.status(200).body("Session removed");
                }else{
                    return  ResponseEntity.status(404).body("Session could not be removed");
                }
            } catch (Exception e) {
                return  ResponseEntity.status(500).body("Session could not be removed");
            }

        }
    }



}
