package com.latihan.repository.impl;

import java.util.HashMap;
import java.util.Map;

import com.latihan.domain.Author;
import com.latihan.domain.Book;
import com.latihan.repository.BookRepository;

public class BookRepositoryImpl implements BookRepository {
	
	private Map<Long, Book> bookMap;
	
//	public BookRepositoryImpl() {
//		super();
//		bookMap = new HashMap<Long, Book>();
//		Author author = new Author();
//		author.setId(1L);
//		author.setName("Riska Nur Alfiyah");
//		author.setBirthDate(-12760L);
//		
//		Book book1 = new Book(author);
//		book1.setId(1L);
//		book1.setTitle("Bumi Manusia");
//		book1.setDescription("Bumi Manusia adalah salah satu Novel karya Riska Nur Alfiyah");
//		
//		
//		bookMap.put(book1.getId(), book1);
//	}

	@Override
	public Book findBookById(Long id) {
		Book book = bookMap.get(id);
		return book;
	}

	public Map<Long, Book> getBookMap() {
		return bookMap;
	}

	public void setBookMap(Map<Long, Book> bookMap) {
		this.bookMap = bookMap;
	}
}
