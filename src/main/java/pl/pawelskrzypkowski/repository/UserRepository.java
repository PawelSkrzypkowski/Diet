package pl.pawelskrzypkowski.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pawelskrzypkowski.model.User;

/**
 * Created by Paweł on 12.09.2017.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
