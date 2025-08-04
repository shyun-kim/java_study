package chapter21_miniproject.repository;

import java.util.List;

import chapter21_miniproject.model.MemberVo;

public interface ProjectRepositoryInterface<A, B> {
	public List<A> showBookList();
	public List<B> customerInfo();
}
