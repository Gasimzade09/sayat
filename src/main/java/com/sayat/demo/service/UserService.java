package com.sayat.demo.service;

import com.sayat.demo.model.User;
import com.sayat.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> getAll(){
        return repository.findAll();
    }

    public void save(User u){
        repository.save(u);
    }
}
