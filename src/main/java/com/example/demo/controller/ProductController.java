package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Product;
import com.example.demo.service.PrdouctService;

@RestController
public class ProductController {
	@Autowired
	PrdouctService prdouctService;

	@PostMapping(path="/products")
	public Product addProduct(Product product) {
		prdouctService.addProduct(product);
		return product;

	}

	@GetMapping("products/{productId}")
	public Product viewProduct(@PathVariable int productId) {

		return prdouctService.getAllid(productId);
		

	}

}
