package ru.akimov.spring.security.securityApp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.akimov.spring.security.securityApp.model.Role;
import ru.akimov.spring.security.securityApp.model.User;
import ru.akimov.spring.security.securityApp.service.RoleService;
import ru.akimov.spring.security.securityApp.service.UserService;


@Component
public class CreateTable {

    private final UserService userService;
    private final RoleService roleService;

    @Autowired

    public CreateTable(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    Role adminRole = new Role("ROLE_ADMIN");
    Role userRole = new Role("ROLE_USER");


    private final User admin = new User("tommy@mail.ru", "J", "MIB", "admin");
    private final User user = new User("will@mail.ru", "K", "MIB", "user");
    String[] roleAdmin = new String[]{"ROLE_ADMIN", "ROLE_USER"};
    String[] roleUser = new String[]{"ROLE_USER"};

    public void create() {
        roleService.saveRole(adminRole);
        roleService.saveRole(userRole);
        userService.saveUser(admin, roleAdmin);
        userService.saveUser(user, roleUser);
    }

}