package com.iiht.jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.iiht.jpa.repository.BookRepository;
import com.iiht.jpa.repository.PageRepository;
import com.iiht.jpa.resources.Book;
import com.iiht.jpa.resources.Page;

@SpringBootApplication
public class Jpaone2manyApplication {

	public static void main(String[] args) {
		SpringApplication.run(Jpaone2manyApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner mappingDemo(BookRepository bookrepository, PageRepository pagerepository) {
		return args->{
			Book book =new Book("Spring boot","Josh Lang","8735");
			Page p1=new Page(1,"Introduction", "Beautiful Spring");
			Page p2=new Page(65,"java & contents", "java 8 lambda");
			Page p3=new Page(95,"Concurrency", "Virtual Threads");
			
			book.getPages().add(p1);
			book.getPages().add(p2);
			book.getPages().add(p3);
			
			bookrepository.save(book);
		};
	}

}
