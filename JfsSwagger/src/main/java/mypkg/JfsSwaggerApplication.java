package mypkg;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@SpringBootApplication
@RestController
@RequestMapping("products")
public class JfsSwaggerApplication {

	
private List<ProductModel> products = new ArrayList<ProductModel>();
	
	@PostMapping("/addproduct")
	public ProductModel addproduct(@RequestBody ProductModel productModel)
	{
		products.add(productModel);
		return productModel;
	}
	
	@GetMapping("/viewProducts")
	public List showProduct()
	{
		return products;
	}
	public static void main(String[] args) {
		SpringApplication.run(JfsSwaggerApplication.class, args);
		
	}
	@GetMapping("/hi")
	public String getName()
	{
		return "LAKME";
	}

}
