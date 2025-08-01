package com.bookmgm.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bookmgm.model.BookVo;

import db.DBConn;
import db.GenericRepositoryInterface;

public class Yes24BookRepository extends DBConn implements GenericRepositoryInterface<BookVo>{
	
	List<BookVo> library = new ArrayList<BookVo>();
	
	public Yes24BookRepository() {
		System.out.println("=Yes24=");
	}
	
	@Override
	public int insert(BookVo book) {
		int rows = 0;
		String sql = """
				insert into book_yes24(title, author, price, isbn, bdate)
				values(?, ?, ?, rand()*10000, now())
				""";
		try {
			getPreparedStatement(sql);
//			pstmt.setString(1, book.getBid());
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getAuthor());
			pstmt.setInt(3, book.getPrice());
//			pstmt.setInt(4, book.getIsbn());
//			pstmt.setString(5, book.getBdate());
			rows = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return rows;
	}
	
	@Override
	public List<BookVo> findAll() {
		List<BookVo> list = new ArrayList<BookVo>();
		String sql = """
				select bid, title, author, price, isbn, bdate
				from book_tj
				""";
		try {
			getPreparedStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BookVo book = new BookVo();
				book.setBid(rs.getString(1));
				book.setTitle(rs.getString(2));
				book.setAuthor(rs.getString(3));
				book.setPrice(rs.getInt(4));
				book.setIsbn(rs.getInt(5));
				book.setBdate(rs.getString(6));
				
				list.add(book);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public int remove(String bid) {
		int rows = 0;
		String sql = """
				delete from book_tj
				where bid = ?
				""";
		try {
			getPreparedStatement(sql);
			pstmt.setString(1, bid);
			rows = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rows;
	}
//	@Override
//	public void remove(BookVo book) {
//		Iterator<BookVo> ie = library.iterator();
//		while (ie.hasNext()) {
//			BookVo b = ie.next();
//			if(b == book) {
//				ie.remove();
//			}
//		}
//	}
	
	@Override
	public int update(BookVo book) {
		int rows = 0;
		String sql = """
				update book_tj
					set title=?, author=?, price=?
				where bid=?
				""";
		try {
			getPreparedStatement(sql);
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getAuthor());
			pstmt.setInt(3, book.getPrice());
			pstmt.setString(4, book.getBdate());
			rows = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return rows;
	}
	
	@Override
	public BookVo find(String bid) {
		BookVo book = null;
		String sql = """
				select bid, title, author, price, isbn, bdate
				from book_tj
				where bid = ?
				""";
		try {
			getPreparedStatement(sql);
			pstmt.setString(1, bid);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				book = new BookVo();
				book.setBid(rs.getString(1));
				book.setTitle(rs.getString(2));
				book.setAuthor(rs.getString(3));
				book.setPrice(rs.getInt(4));
				book.setIsbn(rs.getInt(5));
				book.setBdate(rs.getString(6));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return book;
	}
	
	@Override
	public int getCount() {
		int rows = 0;
		String sql = "select count(*) from book_yes24";
				try {
					getPreparedStatement(sql);
					rs = pstmt.executeQuery();
					while(rs.next()) rows = rs.getInt(1);
				} catch (Exception e) {
					e.printStackTrace();
				}
		return rows;
	}
}
