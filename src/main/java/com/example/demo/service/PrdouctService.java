package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Product;
@Service
public class PrdouctService {

	static ArrayList<Product> productList = new ArrayList<Product>();

	public List<Product> getAllLisT() {
		productList.add(new Product(1, "pen", "good", 1.0f));
		productList.add(new Product(2, "rubber", "good", 12.5f));
		productList.add(new Product(3, "bag", "good", 38.0f));
		productList.add(new Product(4, "pencil", "good", 2.0f));

		return productList;

	}

	public Product getAllid(Integer id) {
		return productList.get(id + 1);
	}

	public void addProduct(Product pro) {
		productList.add(pro);
	}
}
