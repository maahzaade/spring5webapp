package guru.springframework.spring5webapp.repositories;/*
 * Created by Mahdiye on 2021, May, 03
 */

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
