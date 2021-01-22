package edu.xau.gulimall.coupon.dao;

import edu.xau.gulimall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author yangbin
 * @email 1765595108@qq.com
 * @date 2021-01-16 22:43:56
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
