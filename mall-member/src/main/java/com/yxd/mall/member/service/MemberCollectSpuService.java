package com.yxd.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yxd.common.utils.PageUtils;
import com.yxd.mall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author Yxd
 * @email 1520501795@qq.com
 * @date 2022-09-11 14:49:25
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

