package com.senera.webApp.repository;

import com.senera.webApp.Model.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Senera Madushan
 * @comment
 */
@Repository
public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
