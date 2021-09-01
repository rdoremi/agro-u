package com.agro;

import com.agro.service.utils.SpringUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.agro.dao.mapper")
//@ComponentScan(basePackages = {"com.agro"})
@EnableCaching
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class Application {

    @Bean
    public SpringUtil getSpringUtil(){
        return new SpringUtil();
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
