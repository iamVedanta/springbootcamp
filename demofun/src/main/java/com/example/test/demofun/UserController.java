package com.example.test.demofun;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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
    public String getUsers() {
        // ArrayList<String> cars = new ArrayList<String>();
        // cars.add("Volvo");
        // cars.add("BMW");
        // cars.add("Ford");
        // cars.add("Mazda");
        // String[] arr = { "Volvo", "BMW", "Ford", "Mazda" };
        // return arr;

        List<String> userList = new ArrayList<>();
        userList.add("user1");
        userList.add("user2");
        userList.add("user3");
        userList.add("user4");
        return userList.toString();
    }

    @PostMapping()
    public String createUser(@RequestBody String entity) {
        return "User created Successfully with Id" + entity;
    }

    @PostMapping("/{userId}")
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
