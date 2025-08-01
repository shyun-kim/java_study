package com.bookmgm.service;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.bookmgm.application.BookManagementApplication;
import com.bookmgm.model.BookVo;
import com.bookmgm.repository.AladinBookRepository;
import com.bookmgm.repository.BookRepository;
import com.bookmgm.repository.InMemoryBookRepository;
import com.bookmgm.repository.Yes24BookRepository;

import db.GenericRepositoryInterface;



public class DefaultBookService implements BookService{
	BookManagementApplication bma; // 체크
	GenericRepositoryInterface<BookVo> repository;
	
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
		System.out.print("도서관 선택> ");
		int rno = bma.scan.nextInt();
//		if(rno == 1) {
//			repository = new InMemoryBookRepository("교육센터"); //rno를 이용해서 체크 가능
//		} else if(rno == 2) {
//			repository = new InMemoryBookRepository("알라딘");
//		} else if(rno == 3) {
//			repository = new InMemoryBookRepository("예스24");
//		}
		if(rno == 1) {
			repository = new InMemoryBookRepository(1); //rno를 이용해서 체크 가능
		} else if(rno == 2) {
			repository = new InMemoryBookRepository(2);
		} else if(rno == 3) {
			repository = new InMemoryBookRepository(3);
		}
//		if(rno == 1) {
//			repository = new InMemoryBookRepository();
//		} else if(rno == 2) {
//			repository = new AladinBookRepository();
//		} else if(rno == 3) {
//			repository = new Yes24BookRepository();
//		}
	}
	
	
	/**
	 * 도서 생성
	 */
	public BookVo createBook() {
		Random rd = new Random();
		BookVo book = new BookVo();
//		int id = rd.nextInt(1000,9999);
//		book.setId(String.valueOf(rd.nextInt(1000,9999)));
		
		book.setIsbn(rd.nextInt(1000,9999));
		
		System.out.print("도서명> ");
		book.setTitle(bma.scan.next());

		System.out.print("저자> ");
		book.setAuthor(bma.scan.next());
		
		System.out.print("가격> ");
		book.setPrice(bma.scan.nextInt());
		return book;
	}
	
	/**
	 * 도서 수정 생성
	 * @param book - db에서 가져온 old book 정보
	 * 도서 수정시 도서 정보를 일부 수정하여 반환
	 */
	public BookVo createBook(BookVo book) {
		System.out.print("도서명> ");
		book.setTitle(bma.scan.next());

		System.out.print("저자> ");
		book.setAuthor(bma.scan.next());
		
		System.out.print("가격> ");
		book.setPrice(bma.scan.nextInt());
		
		
		return book;
	}
	
	@Override
	public void register() {
//		selectRepository();
		BookVo book = createBook();
		if(repository.insert(book) == 1) {
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
			List<BookVo> library = repository.findAll();
			library.forEach(book -> {
				System.out.print("["+book.getBid()+"]\t");
				System.out.print(book.getTitle()+"\t");
				System.out.print(book.getAuthor()+"\t");
				System.out.print(book.getPrice()+"\t");
				System.out.print(book.getIsbn()+"\t");
				System.out.print(book.getBdate()+"\n");
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
			BookVo book = repository.find(bma.scan.next());
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
			BookVo book = repository.find(bma.scan.next());
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
	public void printBook(BookVo book) {
		System.out.println("-------------------------------------------------");
		System.out.print("["+book.getBid()+"]\t");
		System.out.print(book.getTitle()+"\t");
		System.out.print(book.getAuthor()+"\t");
		System.out.print(book.getPrice()+"\n");
		System.out.println("-------------------------------------------------");
	}
	
	@Override
	public void delete() {
		if(getCount() != 0) {
			System.out.print("도서번호(4자리)> ");
			BookVo book = repository.find(bma.scan.next());
			if(book !=null) {
//				repository.remove(book.getId());
				repository.remove(book.getBid());
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
		repository.close();
		System.exit(0);
	}
	
	@Override
	public int getCount() {
		return repository.getCount();
	}
	
	@Override
	public void changeRepository() {
		if(repository != null) {
			repository.close();
			selectRepository();
			System.out.println("✅ 도서관이 변경되었습니다.");
			bma.showMenu();

		}
	}
}
