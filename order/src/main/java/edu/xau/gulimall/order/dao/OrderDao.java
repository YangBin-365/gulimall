package edu.xau.gulimall.order.dao;

import edu.xau.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author yangbin
 * @email 1765595108@qq.com
 * @date 2021-01-16 23:25:11
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
