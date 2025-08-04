package chapter21_miniproject.repository;

import java.util.List;

import chapter21_miniproject.model.BookVo;
import chapter21_miniproject.model.CartVo;
import chapter21_miniproject.model.MemberVo;

public interface ProjectRepositoryInterface<A,B> {
	public List<A> showBookList();
	public List<B> customerInfo(MemberVo member);
	public List<CartVo> findAll();
	public void addItem(String bid);
	public BookVo find(String bid);
}
