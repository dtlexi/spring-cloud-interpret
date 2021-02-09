package online.renjilin;

import ch.qos.logback.classic.pattern.MessageConverter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableEurekaClient
public class UserApplication implements WebMvcConfigurer {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class);
    }


    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        //创建fastjson转换器实例
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
        //配置对象
        FastJsonConfig config = new FastJsonConfig();
        converter.setFastJsonConfig(config);
        converters.add(converter);
    }

}
