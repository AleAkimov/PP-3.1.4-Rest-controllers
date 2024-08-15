package ru.akimov.spring.security.securityApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.akimov.spring.security.securityApp.model.User;


@RestController
@RequestMapping("/api/user")
public class UserRestController {
    @GetMapping
    public ResponseEntity<User> getUser(@AuthenticationPrincipal User user, Model model) {
        model.addAttribute("user", user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
