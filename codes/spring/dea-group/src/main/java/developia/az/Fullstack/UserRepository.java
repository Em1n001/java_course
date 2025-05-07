package developia.az.Fullstack;

import com.example.bookapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    developia.az.BookClaims.User findByUsername(String username);
}
