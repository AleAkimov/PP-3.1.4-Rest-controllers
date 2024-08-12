package ru.akimov.spring.security.securityApp.service;


import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import ru.akimov.spring.security.securityApp.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<User> getAllUsers();

    void saveUser(User user, String[] roles);

    User getUserById(int id);

    void updateUser(User user, String[] roles);

    void deleteUserById(int id);

    UserDetails loadUserByUsername(String username);
}