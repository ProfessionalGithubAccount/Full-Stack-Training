package com.iiht.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iiht.jpa.resources.Page;

@Repository
public interface PageRepository extends CrudRepository<Page,Long>{
	
}
