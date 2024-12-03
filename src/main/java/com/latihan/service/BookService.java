package com.latihan.service;

import com.latihan.dto.BookDetailDTO;

public interface BookService {
	
	public BookDetailDTO findBookDetailById(Long bookId);

}
