package com.senera.webApp.repository;

import com.senera.webApp.Model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Senera Madushan
 * @comment
 */
@Repository
public interface BookRepository  extends CrudRepository<Book,Long> {
}
