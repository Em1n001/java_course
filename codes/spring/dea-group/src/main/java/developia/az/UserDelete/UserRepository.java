package developia.az.UserDelete;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

     @Transactional
    @Query(value = "DELETE FROM Post p WHERE p.user_id = :userId", nativeQuery = true)
    void deletePostsByUserId(Long userId);

    @Transactional
    @Query(value = "DELETE FROM User u WHERE u.id = :userId", nativeQuery = true)
    void deleteUserById(Long userId);
}
