package com.yang.config;

import com.yang.annotation.EnableDemoSPI;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.Assert;

import java.util.List;

/**
 * 粗缯大布裹生涯
 *
 * @author BobYang
 * @date 2023/4/12 16:13
 */
public class EnableAutoImportSelector implements DeferredImportSelector, BeanClassLoaderAware {

    private ClassLoader classLoader;

    @Override
    public String[] selectImports(AnnotationMetadata metadata) {
        AnnotationAttributes attributes = AnnotationAttributes.fromMap(
                metadata.getAnnotationAttributes(EnableDemoSPI.class.getName(),true)
        );
        Assert.notNull(attributes, "EnableDemoSPI must not be null");
        if (!attributes.getBoolean("enabled")) {
            return new String[0];
        }
//        List<EnableDemoSPI> strings = SpringFactoriesLoader.loadFactories(EnableDemoSPI.class,this.classLoader);
//        return strings.stream().map(model -> EnableDemoSPI.class.getName()).toArray(String[]::new);
        List<String> strings = SpringFactoriesLoader.loadFactoryNames(EnableDemoSPI.class,this.classLoader);
        return strings.toArray(new String[0]);
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }
}
