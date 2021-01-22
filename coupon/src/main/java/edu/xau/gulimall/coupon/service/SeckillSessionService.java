package edu.xau.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import edu.xau.common.utils.PageUtils;
import edu.xau.gulimall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author yangbin
 * @email 1765595108@qq.com
 * @date 2021-01-16 22:43:56
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

