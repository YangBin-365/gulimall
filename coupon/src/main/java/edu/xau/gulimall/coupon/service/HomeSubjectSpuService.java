package edu.xau.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import edu.xau.common.utils.PageUtils;
import edu.xau.gulimall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author yangbin
 * @email 1765595108@qq.com
 * @date 2021-01-16 22:43:56
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

