package org.example.REALSE.web.admin.config;



import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("org.example.REALSE.web.*.mapper")//不知道这个地方起没起到作用
public class MybatisPlusConfiguration {

}

