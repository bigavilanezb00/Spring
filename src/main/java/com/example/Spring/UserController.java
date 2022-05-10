package com.example.Spring;

import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class UserController {
    UsersDAO usersDAO;

    public UserController(UsersDAO userRepository) {
        this.usersDAO = userRepository;
    }

    public List<User> getAllUsers() {
        return usersDAO.findAll();
    }


    public User findById(String id) {
        Optional<User> user = usersDAO.findById(Integer.valueOf(id));
        if (user.isPresent()) return user.get();
        else return null;
    }

/*
    public User getUser(String id) {
        return usersDAO.findById(Integer.valueOf(id));
    }
*/

/*    public User getUserByName(String fullname) {
        return usersDAO.findByName(fullname);
    }*/

/*    public void addUser(User user) {
        usersDAO.addUser(user);
    }

    public void removeUser(String id) {
        usersDAO.removeUserById(Integer.valueOf(id));
    }
*/
}