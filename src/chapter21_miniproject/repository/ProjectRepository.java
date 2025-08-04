package chapter21_miniproject.repository;

import java.util.ArrayList;
import java.util.List;

import chapter21_miniproject.model.BookVo;
import chapter21_miniproject.model.MemberVo;
import db.DBConn;

public class ProjectRepository extends DBConn implements ProjectRepositoryInterface<BookVo, MemberVo> {
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
	
	public List<MemberVo> customerInfo() {
		List<MemberVo> list = new ArrayList<MemberVo>();
		String sql = """
				select name, phone, address
				from book_market_member;
				""";
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
	
	public List<BookVo> addItem(String bid) {
		List<BookVo> list = new ArrayList<BookVo>();
		
		System.out.println("으앙");
		return list;
	}

}
