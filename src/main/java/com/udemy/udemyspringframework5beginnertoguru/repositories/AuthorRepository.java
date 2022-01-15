package com.udemy.udemyspringframework5beginnertoguru.repositories;

import com.udemy.udemyspringframework5beginnertoguru.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
