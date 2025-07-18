package com.bookmgm.repository;

import java.util.List;
import com.bookmgm.model.Book;

public interface BookRepository {

	boolean insert(Book book);
	List<Book> selectAll();
	void remove(String id);
	void update(Book book);
	Book select(String id);
	int getCount();
}
