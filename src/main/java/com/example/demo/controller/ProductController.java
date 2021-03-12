package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

	@PostMapping(path = "/products")
	public Product addProduct(Product product) {
		prdouctService.addProduct(product);
		return product;

	}

	@GetMapping("products/{productId}")
	public ResponseEntity<Product> viewProduct(@PathVariable int productId) {

		return new ResponseEntity<Product>(prdouctService.getAllid(productId),
				HttpStatus.ACCEPTED);

	}

	@GetMapping("/products")
	public ResponseEntity<List<Product>> getAllPro() {

		return new ResponseEntity<List<Product>>(prdouctService.getAllLisT(),
				HttpStatus.OK);
	}
}
