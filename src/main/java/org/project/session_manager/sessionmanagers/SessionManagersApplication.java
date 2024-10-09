package org.project.session_manager.sessionmanagers;

import org.project.session_manager.sessionmanagers.Model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SessionManagersApplication {

    public static void main(String[] args) {
        SpringApplication.run(SessionManagersApplication.class, args);
    }

}
