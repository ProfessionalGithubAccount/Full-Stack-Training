package com.iiht.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iiht.jpa.resources.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
	Book findByIsbn(String isbn);
}
