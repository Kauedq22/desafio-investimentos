package kaue.Investimento.service;


import java.util.UUID;

import org.springframework.stereotype.Service;

import kaue.Investimento.dto.UserDTO;
import kaue.Investimento.repository.UserRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {
    
    private UserRepository repository;

    public UUID creatUser(UserDTO dto){
        var user = repository.save(dto.toUser());

        return user.getId();
    }
    
}
