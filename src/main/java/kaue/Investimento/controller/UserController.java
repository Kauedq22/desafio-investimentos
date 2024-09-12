package kaue.Investimento.controller;

import org.springframework.web.bind.annotation.RestController;

import kaue.Investimento.dto.UserDTO;
import kaue.Investimento.entity.User;
import kaue.Investimento.service.UserService;
import lombok.AllArgsConstructor;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {
    
    private UserService service;

    @PostMapping
    public ResponseEntity<User> createdUser(@RequestBody UserDTO request) {
        var userId = service.creatUser(request);
        return ResponseEntity.created(URI.create("/users" + userId.toString())).build();
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserById(@RequestParam("userId") String userId) {
        
        return null;
    }
    
    
}
