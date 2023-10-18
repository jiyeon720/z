package kr.co.himedia.exception02;

public class PasswordExceptionTest {
	
	private String password;
	
	public void setPassword(String password) throws PasswordException {
		
		if(password == null)
			throw new PasswordException("비밀번호는 Null일 수 없습니다람쥐ദ്ദിᐢ. .ᐢ₎");
		else if (password.length() < 8)
			throw new PasswordException("비밀번호는 8자 이상이어야 합니다람쥐ദ്ദിᐢ. .ᐢ₎");
		else if (password.matches("[a-zA-Z]+"))
			throw new PasswordException("비민번호는 숫자나 특수문자를 포함해야 합니다람쥐ദ്ദിᐢ. .ᐢ₎");
		
		this.password = password;
	}

	

	public static void main(String[] args) {
		
		PasswordExceptionTest test =new PasswordExceptionTest();
		
		
		String password = null;
		
		try {
			test.setPassword(password);
		} catch (PasswordException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		} 
		
		
		
		
		password = "himedia";
		
		try {
			test.setPassword(password);
		} catch (PasswordException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		
		
		password = "himediachenho";
		
		try {
			test.setPassword(password);
		} catch (PasswordException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		password = "himedia#7";
		
		try {
			test.setPassword(password);
		} catch (PasswordException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
}
