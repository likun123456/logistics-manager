package com.bruce.logisticsmanager.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: car-manager
 * @description:
 * @author: likun
 * @create: 2022-05-05 23: 10
 **/
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .select()
                //RequestHandlerSelectors配置扫描接口的方式（还有any，none等），
                //basePackage：指定要扫描的包
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build().globalOperationParameters(getParameterList());
    }

    //配置swagger-ui.html的页面信息
    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Swagger-Api文档",
                "desc",
                "v1.0",
                "urn:tos",
                new Contact("bruce", "http://www.apache.org/licenses/LICENSE-2.0", "1009768549@qq.com"),  //作者信息
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList<>());
    }

    public List<Parameter> getParameterList() {
        ParameterBuilder token = new ParameterBuilder();
        List<Parameter> params = new ArrayList<>();
        token.name("token")											//这个是请求头的名字，
                .description("令牌")				 				//在文档中的中文描述
                .modelRef(new ModelRef("string"))
                .parameterType("header")						//这个参数的类型
                .required(false)									 //是否必填
                .build();
        params.add(token.build());
        return params;
    }

}
