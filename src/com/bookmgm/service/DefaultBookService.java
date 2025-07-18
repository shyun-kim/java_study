package com.bookmgm.service;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.bookmgm.application.BookManagementApplication;
import com.bookmgm.model.Book;
import com.bookmgm.repository.AladinBookRepository;
import com.bookmgm.repository.BookRepository;
import com.bookmgm.repository.InMemoryBookRepository;
import com.bookmgm.repository.Yes24BookRepository;



public class DefaultBookService implements BookService{
	BookManagementApplication bma; // 체크
	BookRepository repository;
	
	public DefaultBookService() {}
	public DefaultBookService(BookManagementApplication bma) {
		this.bma=bma;
		selectRepository();

//		repository = new InMemoryBookRepository();
	}
	
	
	/**
	 * 도서관 선택
	 */
	public void selectRepository(){
		System.out.println("================================");
		System.out.println("1. 교육센터\t 2. 알라딘\t 3. 예스24");
		System.out.println("================================");
		System.out.print("도서관 선택>");
		int rno = bma.scan.nextInt();
		if(rno == 1) {
			repository = new InMemoryBookRepository();
		} else if(rno == 2) {
			repository = new AladinBookRepository();
		} else if(rno == 3) {
			repository = new Yes24BookRepository();
		}
	}
	
	
	/**
	 * 도서 생성
	 */
	public Book createBook() {
		Random rd = new Random();
		Book book = new Book();
//		int id = rd.nextInt(1000,9999);
		book.setId(String.valueOf(rd.nextInt(1000,9999)));
		
		System.out.print("도서명> ");
		book.setName(bma.scan.next());

		System.out.print("저자> ");
		book.setAuthor(bma.scan.next());
		
		System.out.print("가격> ");
		book.setPrice(bma.scan.nextInt());
		return book;
	}
	
	/**
	 * 도서 생성
	 * @param book - db에서 가져온 old book 정보
	 * 도서 수정시 도서 정보를 일부 수정하여 반환
	 */
	public Book createBook(Book book) {
		System.out.print("도서명> ");
		book.setName(bma.scan.next());

		System.out.print("저자> ");
		book.setAuthor(bma.scan.next());
		
		System.out.print("가격> ");
		book.setPrice(bma.scan.nextInt());
		
		
		return book;
	}
	
	@Override
	public void register() {
		selectRepository();
		Book book = createBook();
		if(repository.insert(book)) {
			System.out.println("✅ 도서 등록 완료");
		} else {
			System.out.println("❌ 도서 등록 실패");
		}
		bma.showMenu();
	}
	
	/**
	 * 도서 조회
	 */
	@Override
	public void list() {
		if (getCount() != 0) {
			List<Book> library = repository.selectAll();
			library.forEach(book -> {
				System.out.print("["+book.getId()+"]\t");
				System.out.print(book.getName()+"\t");
				System.out.print(book.getAuthor()+"\t");
				System.out.print(book.getPrice()+"\n");
			});

		} else {
			System.out.println(">>등록된 도서가 없습니다.");
		}
		bma.showMenu();
	}
	
	/**
	 * 도서 검색
	 */
	@Override
	public void search() {
		if(getCount() != 0) {
			System.out.print("도서번호(4자리)> ");
			Book book = repository.select(bma.scan.next());
			if (book != null) {
				printBook(book);
			} else {
				System.out.println(">>검색된 도서가 없습니다.");
			}
			
		} else {
			System.out.println(">>등록된 도서가 없습니다.");
		}
		bma.showMenu();
	}
	
	/**
	 * 도서 수정
	 */
	@Override
	public void update() {
		if(getCount() != 0) {
			System.out.print("도서번호(4자리)> ");
			Book book = repository.select(bma.scan.next());
			if(book !=null) {
				repository.update(createBook(book));
				System.out.println("✅ 도서 수정 완료");

				printBook(book);
			} else {
				System.out.println(">>검색된 도서가 없습니다.");
			}
		} else {
			System.out.println(">>등록된 도서가 없습니다.");
		}
		bma.showMenu();
	}
	
	/**
	 * 도서 출력 - 검색, 수정시 결과 출력
	 * @param book
	 */
	public void printBook(Book book) {
		System.out.println("-------------------------------------------------");
		System.out.print("["+book.getId()+"]\t");
		System.out.print(book.getName()+"\t");
		System.out.print(book.getAuthor()+"\t");
		System.out.print(book.getPrice()+"\n");
		System.out.println("-------------------------------------------------");
	}
	
	@Override
	public void delete() {
		if(getCount() != 0) {
			System.out.print("도서번호(4자리)> ");
			Book book = repository.select(bma.scan.next());
			if(book !=null) {
//				repository.remove(book.getId());
				repository.remove(book);
				System.out.println("✅ 도서 삭제 완료");
			} else {
				System.out.println(">>검색된 도서가 없습니다.");
			}
		} else {
			System.out.println(">>등록된 도서가 없습니다.");
		}
		bma.showMenu();
	}
	
	@Override
	public void exit() {
		System.out.println("시스템이 종료됩니다.");
		System.exit(0);
	}
	
	@Override
	public int getCount() {
		return repository.getCount();
	}

}
