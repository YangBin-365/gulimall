package edu.xau.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import edu.xau.common.utils.PageUtils;
import edu.xau.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author yangbin
 * @email 1765595108@qq.com
 * @date 2021-01-16 14:50:01
 */
public interface CategoryService extends IService<CategoryEntity> {
void     updateCascade(CategoryEntity category);

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

    void removeMenuById(List<Long> asList);

    /**
     * 找到cateLogId的完整路径
     * [父]/[子]/[孙]
     * @param catelogId
     * @return
     *
     */
    Long[] findCatelogPath(Long catelogId);

}

