//package ru.akimov.spring.security.securityApp.controller;
//
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import ru.akimov.spring.security.securityApp.model.User;
//
//@Controller
//@RequestMapping("/user")
//public class UserController {
//
//    @GetMapping
//    public String getUserPage(@AuthenticationPrincipal User user, Model model) {
//        model.addAttribute("user", user);
//        return "user";
//    }
//
//}