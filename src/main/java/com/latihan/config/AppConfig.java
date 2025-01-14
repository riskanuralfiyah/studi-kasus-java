package com.latihan.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.latihan.domain.Author;
import com.latihan.domain.Book;
import com.latihan.repository.BookRepository;
import com.latihan.repository.impl.BookRepositoryImpl;
import com.latihan.service.BookService;
import com.latihan.service.impl.BookServiceImpl;

@ComponentScan(basePackages = {"com.latihan"})
@Configuration
public class AppConfig {
	
	@Bean
	public Author author() {
		return new Author(1L,-12760L ,"Riska Nur Alfiyah");
	}
	
	@Bean
	public Book book1(Author author) {
		Book book = new Book();
		book.setId(1L);
		book.setTitle("Bumi Manusia");
		book.setDescription("Bumi Manusia adalah salah satu Novel karya Riska Nur Alfiyah");
		book.setAuthor(author);
		return book;
	}
	
	@Bean
	public Book book2(Author author) {
		Book book = new Book();
		book.setId(2L);
		book.setTitle("Arok Dedes");
		book.setDescription("Arok Dedes adalah salah satu Novel karya Riska Nur Alfiyah");
		book.setAuthor(author);
		return book;
	}
	
	@Bean
	public BookRepository bookRepository(Book book1, Book book2) {
		Map<Long, Book> bookMap = new HashMap<Long, Book>();
		bookMap.put(1L, book1);
		bookMap.put(2L, book2);
		
		BookRepositoryImpl bookRepository = new BookRepositoryImpl();
		bookRepository.setBookMap(bookMap);
		
		return bookRepository;
	}
}
