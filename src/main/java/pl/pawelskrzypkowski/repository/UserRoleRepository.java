package pl.pawelskrzypkowski.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pawelskrzypkowski.model.UserRole;

/**
 * Created by Paweł on 12.09.2017.
 */
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    UserRole findByRole(String role);
}
