package cookingforeveryone.service;

import cookingforeveryone.domain.User;
import cookingforeveryone.dto.UserDto;
import cookingforeveryone.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class UserService {
    private final UserRepository userRepository;

    public UserDto create(UserDto form) {
        User user = User.builder()
                .name(form.getUsername())
                .email(form.getEmail())
                .password(form.getPassword())
                .build();
        User newUser = userRepository.save(user);
        return new UserDto(newUser.getName(), newUser.getEmail(), newUser.getPassword());
    }

    public void delete(Long id) {
        User user = userRepository.findById(id).orElseThrow(
                () -> new NullPointerException("User not found: " + id));
        userRepository.delete(user);
    }
}