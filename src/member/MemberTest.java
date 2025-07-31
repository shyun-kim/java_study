package member;

import java.util.List;

public class MemberTest {
	public static void main(String[] args) {
		new MemberApp();
		
		
		
		MemberDao memberDao = new MemberDao();
//		MemberVo member = memberDao.search(1);
//		if(member.getMemberId() != 0) {
//			System.out.print(member.getMemberId()+"\t");
//			System.out.print(member.getName()+"\t");
//			System.out.print(member.getEmail()+"\t");
//			System.out.print(member.getCreatedAt()+"\n");	
//		}
		
		
		
		List<MemberVo> list = memberDao.search("홍길동");
		if (list.size() != 0) {
			list.forEach((member) -> {
				System.out.print(member.getMemberId()+"\t");
				System.out.print(member.getName()+"\t");
				System.out.print(member.getEmail()+"\t");
				System.out.print(member.getCreatedAt()+"\n");
			});
			System.out.println("--> 데이터 출력");
		}
		
	}

}
