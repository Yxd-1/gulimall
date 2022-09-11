package com.yxd.mall.member.dao;

import com.yxd.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Yxd
 * @email 1520501795@qq.com
 * @date 2022-09-11 14:49:25
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
