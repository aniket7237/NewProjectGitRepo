package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService service;

	@PostMapping("/saveProduct")
	public Product addProduct(@RequestBody Product product) {
		return service.saveProduct(product);

	}

	@PostMapping("/saveProducts")
	public List<Product> addProducts(@RequestBody List<Product> product) {
		return service.saveProducts(product);

	}

	@GetMapping("/getProducts")
	public List<Product> findAllProduct(@PathVariable List<Product> product) {
		return service.getProduct();

	}

	@GetMapping("/getProduct/{id}")
	public Product findProductbyId(@PathVariable int id) {
		return service.getProductById(id);

	}

	@GetMapping("/getProduct/{name}")
	public Product findProductbyName(@PathVariable String name) {
		return service.getProductByName(name);

	}

	@DeleteMapping("/deleteProduct/{id}")
	public void deleteProduct(@PathVariable int id) {
		service.getDelete(id);

	}
@PutMapping("/update")
	public Product updateProducts(@RequestBody Product product) {
		return service.updateProduct(product);
		
	}



}
