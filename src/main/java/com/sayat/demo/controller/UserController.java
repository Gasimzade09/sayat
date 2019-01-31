package com.sayat.demo.controller;
import com.sayat.demo.model.User;
import com.sayat.demo.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private final UserService service;

    @RequestMapping("/home")
    @ResponseBody
    public String welcome() {
        return "index";
    }

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/get_all")
    public List<User> getAllUsers(){
        System.out.println("getting users");
        return service.getAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/save")
    public void save(@RequestBody User u){
        service.save(u);
    }
}
