package com.example.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(UserResource.USER_RESOURCE)
public class UserResource {
    public static final String USER_RESOURCE = "users";

    UserController userController;
    @Autowired
    public UserResource(UserController userController) {
        this.userController = userController;
    }

    @GetMapping
    public List<User> users() {
        return userController.getAllUsers();
    }

    @GetMapping("/{id}")
    public User userById(@PathVariable String id) {
        return userController.findById(id);
    }
/*
    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") String id) {
        return userController.getUser(id);
    }
*/
/*    @GetMapping("/{fullname}")
    public User getUserByName(@PathVariable("fullname") String fullname) {
        return userController.getUserByName(fullname);
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        userController.addUser(user);
        return user;
    }

    @DeleteMapping("{id}")
    public void removeUser(@PathVariable("id") String id) {
        userController.removeUser(id);
    }

    @GetMapping("{id}/email")
    public Map<String,String> email(@PathVariable("id") String id) {

    }*/
}