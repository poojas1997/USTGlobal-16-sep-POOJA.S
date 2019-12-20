package com.ustglobal.sms.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.sms.dto.ProductResponse;
import com.ustglobal.sms.dto.Products;
import com.ustglobal.sms.service.ServiceDAO;
@CrossOrigin(origins = "*" , allowedHeaders = "*" ,allowCredentials = "true") 
@RestController
public class ProductController {
	ProductResponse response = new ProductResponse();
	
	@Autowired
	private ServiceDAO service;
	
	@PostMapping(path="/add" , consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse addProduct(@RequestBody Products product) {
		ProductResponse response = new ProductResponse();
		if(service.addProduct(product)) {
			response.setStatusCode(200);
			response.setStatusMessage("Product added Succesfully");
			response.setStatusDescription("success");
		} else {
			response.setStatusCode(400);
			response.setStatusMessage("Product addition failed");
			response.setStatusDescription("fail");
		}
		return response;
	}//end of addProduct
	
	@PutMapping(path="/update" , consumes = MediaType.APPLICATION_JSON_VALUE ,produces =  MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse updateProduct(@RequestBody Products product) {
		ProductResponse response = new ProductResponse();

			if(service.updateProduct(product)) {
				response.setStatusCode(201);
				response.setStatusMessage("Success");
				response.setStatusDescription("Data Modified succesfully");
			}else {
				response.setStatusCode(401);
				response.setStatusMessage("Failure");
				response.setStatusDescription("Failed to modify data");
			}
			return response;
		}//end of updateProduct
	
	@GetMapping(path="/searchcategory/{category}" , produces = MediaType.APPLICATION_JSON_VALUE ) 
	public ProductResponse searchProductByCategory(@PathVariable("category")String category) {
		if(service.searchProductByCategory(category) != null) {
			response.setStatusCode(201);
			response.setStatusMessage("Search successfully");
			response.setStatusDescription("success");
		}else {
			response.setStatusCode(401);
			response.setStatusMessage("Failed to modify data");
			response.setStatusDescription("Failure");
		}
		return response;
	}
	
	@GetMapping(path="/searchid/{product_id}" , produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse searchProductById(@PathVariable("product_id")int product_id) {
			Products product = service.searchProductById(product_id);
			if(product != null) {
				response.setStatusCode(201);
				response.setStatusMessage("Success");
				response.setStatusDescription("Book found in db");
				response.setProductBean(Arrays.asList(product));	
			} else {
				response.setStatusCode(401);
				response.setStatusMessage("Failure");
				response.setStatusDescription("Book not found in db");
			}
			return response;
	}
	
	@GetMapping(path="/search/{name}" , produces = MediaType.APPLICATION_JSON_VALUE ) 
	public ProductResponse searchProductByName(@PathVariable("name")String name) {
		if(service.searchProductByName(name) != null) {
			response.setStatusCode(201);
			response.setStatusMessage("Search successfully");
			response.setStatusDescription("success");
		}else {
			response.setStatusCode(401);
			response.setStatusMessage("Failed to modify data");
			response.setStatusDescription("Failure");
		}
		return response;
	}
	
	@GetMapping(path="/{getAll}" , produces = MediaType.APPLICATION_JSON_VALUE ) 
	public ProductResponse getAll() {
		List<Products> product = service.getAll();
		if(product!=null) {
			response.setStatusCode(201);
			response.setStatusMessage("Search successfully");
			response.setStatusDescription("success");
			response.setProductBean(product);
		}else {
			response.setStatusCode(401);
			response.setStatusMessage("Failed to modify data");
			response.setStatusDescription("Failure");
		}
		return response;
	}
	
	}



