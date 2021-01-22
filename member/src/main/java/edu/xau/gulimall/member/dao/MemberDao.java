package edu.xau.gulimall.member.dao;

import edu.xau.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yangbin
 * @email 1765595108@qq.com
 * @date 2021-01-16 23:14:14
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
