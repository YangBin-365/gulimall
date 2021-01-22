package edu.xau.gulimall.product.dao;

import edu.xau.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yangbin
 * @email 1765595108@qq.com
 * @date 2021-01-16 14:50:01
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
