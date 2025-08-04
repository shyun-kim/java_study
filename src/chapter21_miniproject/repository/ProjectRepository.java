package chapter21_miniproject.repository;

import java.util.ArrayList;
import java.util.List;

import chapter21_miniproject.model.BookVo;
import db.DBConn;

public class ProjectRepository extends DBConn implements ProjectRepositoryInterface {
	public List<BookVo> showBookList() {
		List<BookVo> list = new ArrayList<BookVo>();
		String sql = """
				
				""";
		
		
		
		return list;
	}
	
	public ProjectRepository() {
		String sql = """
				
				""";
	}

}
