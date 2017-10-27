package pl.pawelskrzypkowski.service;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.pawelskrzypkowski.model.User;
import pl.pawelskrzypkowski.model.UserRole;
import pl.pawelskrzypkowski.repository.UserRepository;
import pl.pawelskrzypkowski.repository.UserRoleRepository;

/**
 * Created by Paweł on 12.09.2017.
 */
@Service
public class UserService {
    private static final String DEFAULT_ROLE = "ROLE_USER";
    @Setter
    @Autowired
    private UserRepository userRepository;
    @Setter
    @Autowired
    private UserRoleRepository roleRepository;

    public void addWithDefaultRole(User user) {
        UserRole defaultRole = roleRepository.findByRole(DEFAULT_ROLE);
        user.getRoles().add(defaultRole);
        userRepository.save(user);
    }
}
