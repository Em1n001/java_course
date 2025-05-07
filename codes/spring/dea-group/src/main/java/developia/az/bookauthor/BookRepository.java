package developia.az.bookauthor;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    @Query(value = "SELECT title FROM book", nativeQuery = true)
    List<String> findAllBookTitles();
}
