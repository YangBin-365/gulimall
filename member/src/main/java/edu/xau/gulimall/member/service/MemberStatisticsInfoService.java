package edu.xau.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import edu.xau.common.utils.PageUtils;
import edu.xau.gulimall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author yangbin
 * @email 1765595108@qq.com
 * @date 2021-01-16 23:14:14
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

