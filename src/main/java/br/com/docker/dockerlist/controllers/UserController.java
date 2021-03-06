package br.com.docker.dockerlist.controllers;

import br.com.docker.dockerlist.models.User;
import br.com.docker.dockerlist.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200", "http://192.168.99.100:4200"})
@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserRepository repository;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @GetMapping("/host")
    public List<String> getHost() throws UnknownHostException {
        List<String> host = new ArrayList<>();
        host.add(InetAddress.getLocalHost().getHostAddress());
        host.add(InetAddress.getLocalHost().getHostName());
        return host;
    }
}
