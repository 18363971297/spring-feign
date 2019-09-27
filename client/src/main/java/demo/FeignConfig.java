package demo;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: liushoulong
 * @Date: 2019/9/26 23:29
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLevel(){
        return Logger.Level.FULL;
    }
}
