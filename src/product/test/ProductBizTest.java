package product.test;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import product.ProductBiz;
import vo.ProductVO;

class ProductBizTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("setup ...");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown ...");
	}
	
	ProductBiz product; 
	
	@Test
	void testRegisterProductVO() {
		product = new ProductBiz();
		ProductVO t = new ProductVO(100, "ÇÏÇÏ", 300);
		product.register(t);
	}

	@Test
	void testRemoveInteger() {
		product = new ProductBiz();
		product.remove(10);		
	}

	@Test
	void testModifyProductVO() {
		product = new ProductBiz();
		ProductVO t = new ProductVO(1000, "°¶·°½Ã", 35000);
		product.modify(t);
	}

	@Test
	void testGetInteger() {
		product = new ProductBiz();
		ProductVO p = product.get(10);
		System.out.println(p);
	}

	@Test
	void testGet() {
		product = new ProductBiz();
		List<ProductVO> list = product.get();
		for(ProductVO v : list) {
			System.out.println(v);
		}
		
	}

}
