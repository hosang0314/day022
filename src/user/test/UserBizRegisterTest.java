package user.test;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import frame.Biz;
import user.UserBiz;
import vo.UserVO;

class UserBizRegisterTest {
	Biz<UserVO,String> biz;
	public UserBizRegisterTest() {
		biz = new UserBiz();
	}
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testRegisterUserVO() {
		UserVO user = new UserVO("id01", "pwd01", "이말숙");
		try {
			biz.register(user);
		} catch (Exception e) {
			System.out.println("에러코드:"+e.getMessage());
			System.out.println("ID가 중복 되었습니다.");
		}
	}

}
