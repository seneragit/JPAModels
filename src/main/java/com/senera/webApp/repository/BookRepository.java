package com.senera.webApp.repository;

import com.senera.webApp.Model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Senera Madushan
 * @comment
 */
public interface BookRepository  extends CrudRepository<Book,Long> {
}
