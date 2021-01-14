package com.senera.webApp.repository;

import com.senera.webApp.Model.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Senera Madushan
 * @comment
 */
@Repository
public interface AuthorRepository extends CrudRepository<Author,Long> {
}
