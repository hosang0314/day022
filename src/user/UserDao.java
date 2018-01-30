package user;

import java.util.ArrayList;

import frame.Dao;
import vo.UserVO;

public class UserDao extends Dao<UserVO, String> {

	@Override
	public void insert(UserVO t) throws Exception{
		start();
		if(t.getId().equals("id01")) {
			throw new Exception("EX1001");
		}
		System.out.println(t+" Inserted...");
		end();
	}

	@Override
	public void delete(String v) throws Exception{
		start();
		if(v.equals("id01")) {
			throw new Exception();
		}
		System.out.println(v+" Deleted...");
		end();
		
	}

	@Override
	public void update(UserVO t) throws Exception{
		start();
		if(t.getId().equals("id01")) {
			throw new Exception();
		}
		System.out.println(t+" Updated...");
		end();
		
	}

	@Override
	public UserVO select(String v) throws Exception{
		String id = v;
		System.out.println(id+" Selected...");
		UserVO user = new UserVO("id01", "pwd01", "ÀÌ¸»¼÷");
		return user;
	}

	@Override
	public ArrayList<UserVO> select() throws Exception{
		ArrayList<UserVO> list = new ArrayList<>();
		System.out.println("Selected All..");
		list.add(new UserVO("id01", "pwd01", "ÀÌ¸»¼÷"));
		list.add(new UserVO("id02", "pwd02", "±è¸»¼÷"));
		list.add(new UserVO("id03", "pwd03", "Á¤¸»¼÷"));
		list.add(new UserVO("id04", "pwd04", "È²¸»¼÷"));
		list.add(new UserVO("id05", "pwd05", "°í¸»¼÷"));
		return list;
	}
	
}
