package kaue.Investimento.dto;

import java.time.Instant;
import java.util.UUID;

import kaue.Investimento.entity.User;

public record UserDTO(String name,
String email,
String password) {
    
    public User toUser(){
        return new User(UUID.randomUUID(),name, email, password, Instant.now(), null);
    }
}
