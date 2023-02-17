package com.pms.dao;

import java.util.List;

import com.pms.pojo.Product;

public interface ProductDAO {
	void addProduct();
	List<Product> viewAllProduct();
	Product viewProduct(int pid);
	void deleteProduct(int pid);
	void updateProduct(int pid);
	void buyProduct();
	}
