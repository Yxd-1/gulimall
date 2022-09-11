package com.yxd.mall.product;

import com.yxd.mall.product.entity.BrandEntity;
import com.yxd.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("iphone");
        brandService.updateById(brandEntity);
        System.out.println("保存成功");
    }

}
