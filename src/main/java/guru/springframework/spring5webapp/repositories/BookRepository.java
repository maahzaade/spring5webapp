package guru.springframework.spring5webapp.repositories;/*
 * Created by Mahdiye on 2021, May, 03
 */

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
