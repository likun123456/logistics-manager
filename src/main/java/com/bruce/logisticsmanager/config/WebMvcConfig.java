package com.bruce.logisticsmanager.config;

import com.bruce.logisticsmanager.common.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/6 14:26
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {


//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        InterceptorRegistration registration = registry.addInterceptor(new LoginInterceptor());
//        List<String> urls = new ArrayList<>();
//        urls.add("/login**");
//        urls.add("/error");
//        urls.add("**/swagger-resources/**");
//        urls.add("/swagger-resources");
//        urls.add("/swagger-resources/configuration/ui");
//        urls.add("/null/swagger-resources/configuration/ui");
//        urls.add("/null/swagger-resources/configuration/security");
//        urls.add("/swagger-resources/configuration/security");
//        urls.add("/webjars/**");
//        urls.add("/v2/**");
//        urls.add("/doc.html");
//        urls.add("**/swagger-ui.html");
//        urls.add("/swagger-ui.html/**");
//        registration.addPathPatterns("/**");
//        registration.excludePathPatterns(urls);
//    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration registration = registry.addInterceptor(this.getLoginInterceptor());
        registration.addPathPatterns("/**");
        registration.excludePathPatterns("**/swagger-resources/**", "/swagger-ui/**", "/swagger-resources/**",
                "/swagger-ui.html");
    }

    @Bean
    public LoginInterceptor getLoginInterceptor() {
        return new LoginInterceptor();
    }

    // 资源映射增加
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowCredentials(true)
                .allowedOriginPatterns("*")
                .allowedHeaders("*")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .maxAge(3600);
    }
}
