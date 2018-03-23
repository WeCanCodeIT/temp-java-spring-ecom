package org.wecancodeit.ecom.catalog;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {

	@Resource
	ProductRepository productRepo;

	@RequestMapping("/products")
	public String showAllProducts(Model model) {
		model.addAttribute("products", productRepo.findAll());
		return "views/products";
	}

	@RequestMapping(path = "/products/{productName}", method = RequestMethod.POST)
	public String AddProduct(@PathVariable String productName, Model model) {
		productRepo.save(new Product(productName));
		model.addAttribute("products", productRepo.findAll());
		return "partials/products-list";
	}

	@RequestMapping(path = "/products/{productId}", method = RequestMethod.GET)
	public String ShowAProduct(@PathVariable String productId, Model model) {
		model.addAttribute("product", productRepo.findOne(Long.parseLong(productId)));
		return "views/product";
	}
}
