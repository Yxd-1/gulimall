package com.yxd.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yxd.common.utils.PageUtils;
import com.yxd.mall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author Yxd
 * @email 1520501795@qq.com
 * @date 2022-09-11 14:41:35
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

