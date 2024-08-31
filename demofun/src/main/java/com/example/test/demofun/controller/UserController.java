package com.example.test.demofun.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.demofun.model.Users;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @GetMapping()
    public List<Users> getUsers() {
        // ArrayList<String> cars = new ArrayList<String>();
        // cars.add("Volvo");
        // cars.add("BMW");
        // cars.add("Ford");
        // cars.add("Mazda");
        // String[] arr = { "Volvo", "BMW", "Ford", "Mazda" };
        // return arr;

        List<Users> users = new ArrayList<>();
        Users user1 = new Users();
        user1.setId(UUID.randomUUID());
        user1.setName("Vedanta");
        user1.setEmail("ved@gmail.com");
        user1.setPhone("9442322342");

        Users user2 = new Users();
        user2.setId(UUID.randomUUID());
        user2.setName("Raju");
        user2.setEmail("raju@gmail.com");
        user2.setPhone("23423423");

        users.add(user1);
        users.add(user2);
        return users;

    }

    @PostMapping()
    public String createUser(@RequestBody String entity) {
        return "User created Successfully with Id" + entity;
    }

    @GetMapping("/{userId}")
    public String getUserDetials(@PathVariable String userId) {
        return "user details for user " + userId;
    }

    @PutMapping("/{userId}")
    public String updateUser(@PathVariable String userId) {
        return "user updated for user " + userId;
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId) {
        return "user deleted";
    }

}
