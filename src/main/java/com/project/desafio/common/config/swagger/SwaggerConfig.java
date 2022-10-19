package com.project.desafio.common.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    public static final String ARQUIVO_TAG = "Endpoints de Arquivo";

    @Bean
    public Docket apiConfigDocs() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.project.desafio.controller"))
                .paths(PathSelectors.any())
                .build()
                .tags(
                        new Tag(ARQUIVO_TAG, "Controller de Arquivo")
                )
                .apiInfo(infoDocs());
    }

	private ApiInfo infoDocs() {
        return new ApiInfo(
                "Api Documentation - Arquivo",
                "API de Arquivos",
                "1.0.0",
                "Terms",
                null,
                "Apache License",
                "URL",
                new ArrayList<>());
    }

}
