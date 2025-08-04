package chapter21_miniproject.repository;

import java.util.ArrayList;
import java.util.List;

import chapter21_miniproject.application.ProjectApplication;
import chapter21_miniproject.model.BookVo;
import chapter21_miniproject.model.CartVo;
import chapter21_miniproject.model.MemberVo;
import db.DBConn;

public class ProjectRepository extends DBConn implements ProjectRepositoryInterface<BookVo, MemberVo> {
	ProjectApplication api;
	public ProjectRepository() {}
	public ProjectRepository(ProjectApplication api) {
		this.api=api;
	}
	
	public List<MemberVo> customerInfo(MemberVo member) {
		List<MemberVo> list = new ArrayList<MemberVo>();
		String sql = "select name, phone, address"
				+" from book_market_member"
				+" where name = '"+api.member.getName()+"' and phone = "+api.member.getPhone()+";";
				
		try {
			getPreparedStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				MemberVo mlist = new MemberVo();
				mlist.setName(rs.getString(1));
				mlist.setPhone(rs.getString(2));
				mlist.setAddress(rs.getString(3));
				
				list.add(mlist);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	public List<BookVo> showBookList() {
		List<BookVo> list = new ArrayList<BookVo>();
		String sql = """
				select isbn, title, price, author, subtitle, genre, date
				from book_market_books
				""";
		try {
			getPreparedStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BookVo blist = new BookVo();
				blist.setIsbn(rs.getString(1));
				blist.setTitle(rs.getString(2));
				blist.setPrice(rs.getInt(3));
				blist.setAuthor(rs.getString(4));
				blist.setSubtitle(rs.getString(5));
				blist.setGenre(rs.getString(6));
				blist.setDate(rs.getString(7));
				
				list.add(blist);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<CartVo> findAll() {
		List<CartVo> list = new ArrayList<CartVo>();
		String sql = """
				select isbn, quantity, total_price
				from book_market_cart
				""";
		try {
			getPreparedStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				CartVo cartlist = new CartVo();
				cartlist.setIsbn(rs.getString(1));
				cartlist.setQuantity(rs.getInt(2));
				cartlist.setTotalPrice(rs.getInt(3));
				
				
				list.add(cartlist);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	

	//책정보를 찾아서 cart table에 가격, 수량, 금액을 집어넣는다
	//테이블 조회해서 이미 있는애면 오버라이드 시켜야됨
	public void addItem(String bid) {
		List<BookVo> list = new ArrayList<BookVo>();
		BookVo book = new BookVo();
		book = find(bid);
		String sql = "insert into book_market_cart(isbn, quantity, total_price)"
				+" values("+book.getIsbn()+", 1,"+book.getPrice()+");";
		try {
			getPreparedStatement(sql);
			rs=pstmt.executeQuery();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public CartVo find(String bid){
		CartVo book = null;
		String sql = "select isbn, price"
				+" from book_market_books"
				+" where = ?";
		try {
			getPreparedStatement(sql);
			pstmt.setString(1, bid);
			rs = pstmt.executeQuery();
			book = new CartVo();
			book.setIsbn(rs.getString(1));
			book.setTotalPrice(rs.getInt(2));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return book;
	}

}
