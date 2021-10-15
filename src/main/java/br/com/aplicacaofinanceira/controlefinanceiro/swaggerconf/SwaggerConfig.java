package br.com.aplicacaofinanceira.controlefinanceiro.swaggerconf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Configurações do Swagger
 *
 * @author Diego M. Rodrigues
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {           
	
	// @Value("${api.title}")
	private String title = "API Controle Financeiro";

	// @Value("${api.description}")
	private String description = "API que permite fazer a gestão financeira";

	// @Value("${api.version}")
	private String version = "0.01";
	
    @Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.basePackage("br.com.aplicacaofinanceira.controlefinanceiro.controller"))
        .paths(PathSelectors.any()).build().apiInfo(this.apiInfo());
    }
    
	@SuppressWarnings("unused")
	private final ApiInfo apiInfo() {
		return new ApiInfo(title, description, version, null,
				new Contact("Bruno M Oliveira", "", "mail.brunomota@gmail.com"), "MIT License",
				null);
	}
}