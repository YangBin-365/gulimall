package edu.xau.gulimall.product.service.impl;

import edu.xau.gulimall.product.vo.AttrGroupWithAttrsVo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.xau.common.utils.PageUtils;
import edu.xau.common.utils.Query;

import edu.xau.gulimall.product.dao.AttrGroupDao;
import edu.xau.gulimall.product.entity.AttrGroupEntity;
import edu.xau.gulimall.product.service.AttrGroupService;
import org.springframework.util.StringUtils;


@Service("attrGroupService")
public class AttrGroupServiceImpl extends ServiceImpl<AttrGroupDao, AttrGroupEntity> implements AttrGroupService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AttrGroupEntity> page = this.page(
                new Query<AttrGroupEntity>().getPage(params),
                new QueryWrapper<AttrGroupEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public PageUtils queryPage(Map<String, Object> params, Long catelogId) {
        //select * from pms_attr_group where catelog id = ? and (attr_group_id = key or attr_group_name like "%key%");
        QueryWrapper<AttrGroupEntity> wrapper = new QueryWrapper<AttrGroupEntity>();
        String key = String.valueOf(params.get("key"));
        if (!StringUtils.isEmpty(key)) {
            wrapper.eq("attr_group_id", key)
                    .like("attr_group_name", key);
        }
        if (catelogId == 0) {
            IPage<AttrGroupEntity> iPage = this.page(new Query<AttrGroupEntity>().getPage(params),
                    new QueryWrapper<>());
            return new PageUtils(iPage);
        }
             IPage<AttrGroupEntity> iPage = this.page(new Query<AttrGroupEntity>().getPage(params), wrapper.eq("catelog_id", catelogId));
        return new PageUtils(iPage);
    }

    @Override
    public List<AttrGroupWithAttrsVo> getAttrGroupWithAttrsByCatelogId(Long catelogId) {
        return null;
    }

}
