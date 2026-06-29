package ar.edu.unnoba.pdyc2026.catalogservice.controller;

import ar.edu.unnoba.pdyc2026.catalogservice.client.UserClient;
import ar.edu.unnoba.pdyc2026.catalogservice.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog/user")
public class UserProxyController {

    private final UserClient userClient;

    public UserProxyController(UserClient userClient) {
        this.userClient = userClient;
    }

    @GetMapping("/{id}")
    public UserDto getUser(@PathVariable Long id) {
        return userClient.getUserById(id);
    }
}
