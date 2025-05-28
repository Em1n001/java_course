package developia.az.validationtekrar;

import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    public String createUser(@Valid @RequestBody UserRequest request) {
        return "İstifadəçi yaradıldı: " + request.getEmail();
    }
}
