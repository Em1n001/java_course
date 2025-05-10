package developia.az.UserDelete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void deleteUser(Long userId) {
         userRepository.deletePostsByUserId(userId);
        
         userRepository.deleteUserById(userId);
    }
}
