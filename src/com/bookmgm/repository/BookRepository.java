package com.bookmgm.repository;

import java.util.List;
import com.bookmgm.model.BookVo;

public interface BookRepository {

	boolean insert(BookVo book);
	List<BookVo> selectAll();
	void remove(String id);
	void remove(BookVo book);
	void update(BookVo book);
	BookVo select(String id);
	int getCount();
}
