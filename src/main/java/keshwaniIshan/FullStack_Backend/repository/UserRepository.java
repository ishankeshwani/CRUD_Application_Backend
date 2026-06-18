package keshwaniIshan.FullStack_Backend.repository;

import keshwaniIshan.FullStack_Backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long > {
}
