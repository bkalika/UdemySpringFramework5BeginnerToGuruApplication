package com.udemy.udemyspringframework5beginnertoguru.repositories;

import com.udemy.udemyspringframework5beginnertoguru.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
