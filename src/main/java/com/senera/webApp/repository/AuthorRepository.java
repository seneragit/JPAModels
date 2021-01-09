package com.senera.webApp.repository;

import com.senera.webApp.Model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Senera Madushan
 * @comment
 */
public interface AuthorRepository extends CrudRepository<Author,Long> {
}
