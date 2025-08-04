package chapter21_miniproject.service;

import java.util.List;

import chapter21_miniproject.model.BookVo;
import chapter21_miniproject.model.MemberVo;
import chapter21_miniproject.repository.ProjectRepository;

public class ProjectService implements ProjectServiceInterface{
	ProjectRepository repository = new ProjectRepository();
	
	public void showList() {
		List<BookVo> list = repository.showBookList();
		System.out.println("~~~~~");
		if (list != null) {
			list.forEach(blist -> {
				System.out.print(blist.getIsbn()+"\t");
				System.out.print(blist.getTitle()+"\t");
				System.out.print(blist.getPrice()+"\t");
				System.out.print(blist.getAuthor()+"\t");
				System.out.print(blist.getSubtitle()+"\t");
				System.out.print(blist.getGenre()+"\t");
				System.out.print(blist.getDate()+"\n");
			});
		} else {
			System.out.println("등록된 도서가 없습니다.");
		}
		System.out.println("~~~~~");
	}
	
	@Override
	public void checkCustomer(){
		List<MemberVo> list = repository.customerInfo();
		if (list != null) {
				list.forEach(mlist -> {
				System.out.print(mlist.getName()+"\t");
				System.out.print(mlist.getPhone()+"\n");
			});
		} else {
			System.out.println("등록된 고객 정보가 없습니다.");
		}
		
	}
	@Override
	public void checkShoppingCart() {
		System.out.println("2");
	}
	@Override
	public void resetShoppingCart() {
		System.out.println("3");
	}
	@Override
	public void addItemShoppingCart() {
		System.out.println("4");
	}
	@Override
	public void reduceItemShoppingCart() {
		System.out.println("5");
	}
	@Override
	public void deleteItemShoppingCart() {
		System.out.println("6");
	}
	@Override
	public void showReceipt() {
		System.out.println("7");
	}
	@Override
	public void close() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}

}
