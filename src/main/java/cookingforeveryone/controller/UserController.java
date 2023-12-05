package cookingforeveryone.controller;

import cookingforeveryone.domain.User;
import cookingforeveryone.dto.RequestDto;
import cookingforeveryone.dto.UserDto;
import cookingforeveryone.repository.UserRepository;
import cookingforeveryone.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final UserService userService;
    private final UserRepository userRepository;

    @PostMapping("/api/login")
    @ResponseBody
    public void login(@RequestBody RequestDto loginRequest) {
        // ID와 password를 받아온다.
        Long userId = loginRequest.getUserId();
        String password = loginRequest.getUserPassword();
        // UserRepository를 통해 사용자 정보를 가져옴
        Optional<User> storedUser = userRepository.findById(userId);
    }

    // 사용자 생성
    @PostMapping("/api/user")
    public UserDto createUserRequest(HttpServletRequest request, HttpServletResponse response,
                              @RequestBody UserDto form) {
        UserDto userDto = userService.create(form);
        response.setStatus(201);
        return userDto;
    }

    // 사용자 삭제
    @DeleteMapping("/api/user")
    public void deleteUser(@RequestParam(name="trashcanId") Long id, HttpServletRequest request, HttpServletResponse response) {
        userService.delete(id);
        response.setStatus(204);
    }
}