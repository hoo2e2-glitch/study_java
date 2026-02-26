package arrayList.Task;

import java.beans.Encoder;
import java.util.ArrayList;

public class UserFeild {
	
	public ArrayList<Uesr> users = DBconnecter.arr;
	public final int KEY = 300;
	
	
//		1. 회원가입
//		- password, name, phone
//		- 
//		- 
	
//		id 중복체크
		private User checkId(Long id) {
			for(User users: users) {
				if(users.getId().equals(id)) {
					return users;
				}
			}
			return null;
		}
		
//		password암호화
		private void password(Password password) {
			String en = " ";
			for(int i = 0; i < password.lenght(); i++) {
				en += (char)(password.charAt(i) * KEY);
				
			}
			
		}
		
		public void join(User user) {
			User userInDB = checkId(user.getId());
			if(userInDB == null) {
				user.setPassword(Encoder(user.getPassword()));
				users.add(user);
				
			}
			
		}
//		2. 로그인
//		- id, password 화면에서 받음
		public User login(User user) {
			User userID = checkId(user.getId());
			User userPass = checkPass1(user.getPassword());
			if(userID == true) {
				user.equals(userID.getId());
			} if(userPass == true) {
				user.equals(userPass.getPassword());
				
			}
			return user;
			
		}
//		- DB에 id 있는지 검사
		
		private User checkDB(Long id) {
			for(User users: users) {
				if(users.getId().equals(id)) {
					System.out.println("아이디 확인, 비밀번호 입력");
				}
			};
		}
//		- id 찾으면 password 검사
//		- 찾은 user를 리턴
		private User checkDB(String pass) {
			for(User users: users) {
				if(users.getPassword().equals(pass)) {
					System.out.println("비밀번호 확인");
					return users;
				}
			};
		}
		
		
		
		
//		3. 로그아웃
		
		
//		4. 회원탈퇴
//		5. 비밀번호 변경
//		6. 비밀번호 변경
//		7. 인증번호 전송
	
	public static void main(String[] args) {
		UserFeild uf = new UserFeild();
		Uesr uesr1 = new Uesr("hong", "홍길동", "1234", "011");
		Uesr uesr2 = new Uesr("dong", "동길동", "5678", "012");
		
		uf.join(uesr1);
		uf.join(uesr2);
		
		System.out.println(uf.users);
		
		User aa =  uf.login(new Uesr("hong", "홍길동", "1234", "011"));
		System.out.println(aa);
		
		
		
	}

}
