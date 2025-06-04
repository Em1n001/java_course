package developia.az.Swagger;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/{id}")
    public String getUser(@PathVariable Long id) {
        return "İstifadəçi ID: " + id;
    }

    @PostMapping
    public String createUser(@RequestBody String name) {
        return "Yaradıldı: " + name;
    }
}
