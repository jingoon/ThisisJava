package chapter06_Exercise;

public class MemberService {

	public boolean login(String id, String password) {
		boolean ok=false;
		if(id.equals("hong")) {
			if(password.equals("12345")) {
				ok=true;
			}
		}
		
		return ok;
	}
	
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}

}
