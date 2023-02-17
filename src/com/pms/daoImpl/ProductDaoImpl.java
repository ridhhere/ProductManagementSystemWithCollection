package com.pms.daoImpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import com.pms.dao.ProductDAO;
import com.pms.pojo.Product;

public class ProductDaoImpl implements ProductDAO{
	
	Scanner sc = new Scanner(System.in);
	List<Product> addProducts=new ArrayList<Product>();



	@Override
	public void addProduct() {
		// TODO Auto-generated method stub
		System.out.println("How Many Products Do You Want to Add");
		int size=sc.nextInt();
//		ProductInfo=new Product[size];//initializing array with size
		for(int i=1;i<=size;i++) {
		System.out.println("Enter Product ID");
		int id=sc.nextInt();
		System.out.println("Enter Product Name");
		String name=sc.next();
		System.out.println("Enter Product Quantity");
		int qty=sc.nextInt();
		System.out.println("Enter Product Price");
		int price=sc.nextInt();
		Product pro= new Product(id,name,qty,price);
		addProducts.add(pro);
		System.out.println("Product Added SuccessFully");
		}//end of loop
		
	}

	@Override
	public List<Product> viewAllProduct() {
		// TODO Auto-generated method stub
		for(Product p:addProducts) {
			System.out.println(p.getPid()+"\t"+p.getPname()+"\t"+p.getPrice()+"\t"+p.getQty());
		}		
		return addProducts;
	}

	@Override
	public Product viewProduct(int pid) {
		// TODO Auto-generated method stub
		for(Product p:addProducts) {
			if(pid==p.getPid()) {
				System.out.println(p.getPid()+"\t"+p.getPname()+"\t"+p.getPrice()+"\t"+p.getQty());
				return p;
			}
		}
		return null;
	}

	@Override
	public void deleteProduct(int pid) {
		// TODO Auto-generated method stub
		for(Product p:addProducts) {
			if(pid==p.getPid()) {
				System.out.println("Deleted Record !!!! "+p.getPid()+"\t"+p.getPname()+"\t"+p.getPrice()+"\t"+p.getQty());
				addProducts.remove(p);
			}
		}	
	}

	@Override
	public void updateProduct(int pid) {
		// TODO Auto-generated method stub
		for(Product p:addProducts) {
			if(pid==p.getPid()) {
				System.out.println("Enter Product Name");
				String name=sc.next();
				System.out.println("Enter Product Quantity");
				int qty=sc.nextInt();
				System.out.println("Enter Product Price");
				int price=sc.nextInt();
				p.setPname(name);
				p.setPrice(price);
				p.setQty(qty);
				System.out.println("Updated Records !!!! "+p.getPid()+"\t"+p.getPname()+"\t"+p.getPrice()+"\t"+p.getQty());
			}
		}	
	}

	@Override
	public void buyProduct() {
		// TODO Auto-generated method stub
		
	}

}
