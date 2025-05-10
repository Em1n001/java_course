package developia.az.UserDelete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable Long userId) {
        userService.deleteUser(userId);
        return "User and their posts deleted successfully.";
    }
}

