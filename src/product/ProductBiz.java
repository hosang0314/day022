package product;

import java.util.ArrayList;

import frame.Biz;
import frame.Dao;
import vo.ProductVO;

public class ProductBiz extends Biz<ProductVO, Integer> {
	public ProductBiz() {
		dao = new ProductDao();
	}
	
	@Override
	public void register(ProductVO t) {
		try {
			dao.insert(t);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void remove(Integer v) {
		try {
			dao.delete(v);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void modify(ProductVO t) {
		try {
			dao.update(t);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public ProductVO get(Integer v) {
		ProductVO pro = null;
		try {
			pro = dao.select(v);
			return pro;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pro;
	}

	@Override
	public ArrayList<ProductVO> get() {
		ArrayList<ProductVO> list = null;
		try {
			list = dao.select();
			return list;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
