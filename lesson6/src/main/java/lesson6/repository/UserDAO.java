package lesson6.repository;

import lesson6.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Long> {
    User findFirstByName(String username);
}
