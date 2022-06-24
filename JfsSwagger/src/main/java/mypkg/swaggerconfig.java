package mypkg;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//import io.swagger.models.Contact;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
//import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class swaggerconfig {
	
	@Bean
	public Docket swaggerApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/products/*")).build()
				.apiInfo(new ApiInfo("MyApp", "Description about my app","1.0",
						"http://localhost:8222/products/hi",new Contact("Indrani","url","email"),
						"opensource","",
						Collections.EMPTY_LIST
						));
		
	}

}
