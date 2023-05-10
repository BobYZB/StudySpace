package com.yang.starter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 粗缯大布裹生涯
 *
 * @author BobYang
 * @date 2023/3/19 19:00
 */
@Slf4j
public class SPIDemo1 implements ApplicationContextAware {


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        log.info("=============打包测试=========");
    }
}
