package com.secure.noteApp.services;



import com.secure.noteApp.dtos.UserDTO;
import com.secure.noteApp.models.User;

import java.util.List;

public interface UserService {
    void updateUserRole(Long userId, String roleName);

    List<User> getAllUsers();

    UserDTO getUserById(Long id);

    User findByUsername(String username);

    void updateAccountLockStatus(Long userId, boolean lock);
}
