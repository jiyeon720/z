package kr.co.himedia.interface03.userinfo.dao.oracle;
// 서버
import kr.co.himedia.interface03.userinfo.UserInfoDTO;
import kr.co.himedia.interface03.userinfo.dao.UserInfoDAO;

public class UserInfoOracleDAO implements UserInfoDAO{

	
	
	@Override
	public void insertUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("insert into ORACLE DB userid = " + userInfoDTO.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("update into ORACLE DB userid = " + userInfoDTO.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("delete into ORACLE DB userid = " + userInfoDTO.getUserId());		
	}

	@Override
	public void selectUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("select into ORACLE DB userid = " + userInfoDTO.getUserId());		
	}

	
	
	
}
