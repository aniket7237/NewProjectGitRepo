package com.example.demo.service;

import java.util.List;

import javax.print.attribute.standard.MediaSize.Other;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	//For Create the Data
    public Product saveProduct(Product product) {
		return repository.save(product);
    	
    }

    public List<Product> saveProducts(List<Product> products) {
		return repository.saveAll(products);
    	
    }

    //For Fetch the All Data
    public List<Product> getProduct() {
		return repository.findAll();
    	
    }

    public Product getProductById(int id) {
    	return repository.findById(id).orElse(null);
    }

    public Product getProductByName(String name) {
    	return repository.findByName(name);
    }

    //For Delete The Data
    
   public String getDelete(int id) {
	 repository.deleteById(id);
	   return "Product with id number "+id+" is deleted";
   }

   // Design the Method for Update the Data
public Product updateProduct(Product prouct) {// in product we stored the updated value
	Product existingProduct=repository.findById(prouct.getId()).orElse(prouct);
	existingProduct.setName(prouct.getName());
	existingProduct.setQuantity(prouct.getQuantity());
	existingProduct.setPrice(prouct.getPrice());
	
	return repository.save(existingProduct);
	}


}

