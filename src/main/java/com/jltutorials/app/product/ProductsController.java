package com.jltutorials.app.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductsController {
	
	@RequestMapping(value = "/products", method = RequestMethod.GET)
    public String listProducts(Model model) throws Exception {
        model.addAttribute("allProducts", getProducts());
        return "products";
    }
	
	private List<Product> getProducts(){
		List<Product> products = new ArrayList<>();
		products.add(new Product("Apple", 1.0f));
		products.add(new Product("Orange", 1.0f));
		products.add(new Product("Banna", 1.0f));
		return products;
	}
}
