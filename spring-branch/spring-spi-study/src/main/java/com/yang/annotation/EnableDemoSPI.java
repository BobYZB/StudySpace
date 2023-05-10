package com.yang.annotation;

import com.yang.config.EnableAutoImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 粗缯大布裹生涯
 *
 * @author BobYang
 * @date 2023/3/18 23:57
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(EnableAutoImportSelector.class)
public @interface EnableDemoSPI {

    boolean enabled() default true;

}
