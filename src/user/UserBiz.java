package user;

import java.util.ArrayList;

import frame.Biz;
import vo.UserVO;

public class UserBiz extends Biz<UserVO, String> {

	public UserBiz() {
		dao = new UserDao();
	}

	@Override
	public void register(UserVO t) throws Exception{
		try {
			dao.insert(t);
		} catch (Exception e) {
			System.out.println("예외발생");
			throw e;
		}
	}

	@Override
	public void remove(String v) {
		try {
			dao.delete(v);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void modify(UserVO t) {
		try {
			dao.update(t);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public UserVO get(String v) {
		UserVO user = null;
		try {
			user = dao.select(v);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public ArrayList<UserVO> get() {
		ArrayList<UserVO> list = null;
		try {
			list = dao.select();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
