package com.yxd.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、整合mybatis-plus
 *      1）、导入依赖
 *      2）配置
 *          1、配置数据源：
 *              1、导入驱动
 *              2、配置数据源
 *          2、配置mybatis-plus：
 *              1、使用@MapperScan
 *              2、告诉mybatis-plus sql映射文件
 */
@MapperScan("com.yxd.mall.product.dao")
@SpringBootApplication
public class MallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }

}
