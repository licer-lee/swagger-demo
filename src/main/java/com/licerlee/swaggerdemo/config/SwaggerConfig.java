package com.licerlee.swaggerdemo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.licerlee.swaggerdemo"))
                .paths(PathSelectors.any())
                .build();
    }


    private ApiInfo getApiInfo() {
        // 定义联系人信息
        Contact contact = new Contact("M78Star","https://github.com/licer-lee", "licerlee@gmail.com");
        return new ApiInfoBuilder()
                .title("演示 Swagger 的用法")
                .description("演示Swagger中各种注解的用法")
                .version("1.1.2")
                .license("Apache 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0")
                .contact(contact)
                .build();
    }


}
