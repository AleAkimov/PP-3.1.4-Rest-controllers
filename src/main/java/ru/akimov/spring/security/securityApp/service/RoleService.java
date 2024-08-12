package ru.akimov.spring.security.securityApp.service;

import ru.akimov.spring.security.securityApp.model.Role;

import java.util.List;

public interface RoleService {
    void saveRole(Role role);

    List<Role> getAllRoles();
}