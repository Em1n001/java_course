package developia.az.Fullstack;

import com.example.bookapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtUtil jwtUtil;

     @GetMapping("/register")
    public String showRegisterPage() {
        return "register";
    }

     @PostMapping("/register")
    public String registerUser(@RequestParam String username, @RequestParam String password, Model model) {
        Optional<User> existingUser = Optional.empty();
        (existingUser.isPresent()) {
            model.addAttribute("message", "Username already exists!");
            return "register";
        }
        userRepository.save(new User(username, password));
        model.addAttribute("message", "User registered successfully. Please login.");
        return "login";
    }

     @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

     @PostMapping("/login")
    public String loginUser(@RequestParam String username, @RequestParam String password, Model model) {
        Optional<User> user = Optional.empty();

        if (user.isPresent() && user.get().getPassword().equals(password)) {
            String token = jwtUtil.generateToken(username);
            model.addAttribute("token", token);
            model.addAttribute("username", username);
            return "home";  
        } else {
            model.addAttribute("message", "Invalid credentials!");
            return "login";
        }
    }
}
