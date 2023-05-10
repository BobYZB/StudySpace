package com.yang.config;

import com.yang.starter.SPIDemo1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 粗缯大布裹生涯
 *
 * @author BobYang
 * @date 2023/3/19 18:57
 */
@Configuration
public class Config {

    @Bean
    public SPIDemo1 getSPIDemo1() {
        return new SPIDemo1();
    }

}
