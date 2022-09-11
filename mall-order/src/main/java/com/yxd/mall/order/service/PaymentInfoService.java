package com.yxd.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yxd.common.utils.PageUtils;
import com.yxd.mall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author Yxd
 * @email 1520501795@qq.com
 * @date 2022-09-11 14:53:33
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

