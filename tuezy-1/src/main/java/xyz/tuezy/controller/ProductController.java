package xyz.tuezy.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.tuezy.model.Product;
import xyz.tuezy.repository.ProductRepository;
@Controller
public class ProductController {
	@Autowired
    private ProductRepository productRepository;
	
	
	@GetMapping(value = "/product")
	public String welcome(Map<String, Object> model) {
		List<Product> productList = productRepository.findAll();
		model.put("message", productList);
		return "product";
	}
}
