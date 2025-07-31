package member;

import java.util.List;

public interface GenericInterface<T> { // <T>: type, 인터페이스를 implements 할때 <T> 부분에 MemberVo 같은 타입을 명시하면 자동 변환됨
	public List<T> search(String Name); //MemberVo member = (MemberVo)obj;
	public T search(int id);
	public int delete(int id);
	public int update(T entity);
	public List<T> listAll();
	public int insert(T entity);
	
}
