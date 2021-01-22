package edu.xau.gulimall.product;

import edu.xau.gulimall.product.entity.BrandEntity;
import edu.xau.gulimall.product.service.BrandService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductApplicationTests {
    @Autowired
    BrandService service;


    @Test
    public void contextLoads() {
        BrandEntity entity = new BrandEntity();
        entity.setDescript("Nike");
        entity.setName("耐克");
        service.save(entity);
    }

}
