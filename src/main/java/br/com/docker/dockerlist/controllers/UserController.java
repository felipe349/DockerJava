package br.com.docker.dockerlist.controllers;

import br.com.docker.dockerlist.models.User;
import br.com.docker.dockerlist.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserRepository repository;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        System.out.println("Getting all users");
        List<User> users = repository.findAll();
        return users;
    }
}
