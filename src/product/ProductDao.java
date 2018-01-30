package product;

import java.util.ArrayList;

import frame.Dao;
import vo.ProductVO;

public class ProductDao extends Dao<ProductVO, Integer> {
	
	@Override
	public void insert(ProductVO t) {
		start();
		System.out.println(t+" Inserted...");
		end();
		
	}

	@Override
	public void delete(Integer v) {
		start();
		System.out.println(v+" deleted...");
		end();
		
	}

	@Override
	public void update(ProductVO t) {
		start();
		System.out.println(t+" updated...");
		end();
		
	}

	@Override
	public ProductVO select(Integer v) {
		System.out.println(v +" Selected...");
		ProductVO product = new ProductVO(10, "´õ¿ö", 100);
		return product;
	}

	@Override
	public ArrayList<ProductVO> select() {
		ArrayList<ProductVO> list = new ArrayList<>();
		System.out.println("Selected All...");
		list.add(new ProductVO(10, "pro1", 1000));
		list.add(new ProductVO(20, "pro2", 2000));
		list.add(new ProductVO(30, "pro3", 3000));
		list.add(new ProductVO(40, "pro4", 4000));
		list.add(new ProductVO(50, "pro5", 5000));
		return list;
	}

}
