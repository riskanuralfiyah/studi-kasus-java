package com.latihan.repository;

import com.latihan.domain.Book;

public interface BookRepository {
	
	public Book findBookById(Long id);

}
