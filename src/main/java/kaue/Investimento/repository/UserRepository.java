package kaue.Investimento.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import kaue.Investimento.entity.User;

public interface UserRepository extends JpaRepository<User, UUID> {
    
}
