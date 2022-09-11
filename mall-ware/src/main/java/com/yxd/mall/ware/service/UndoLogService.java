package com.yxd.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yxd.common.utils.PageUtils;
import com.yxd.mall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author Yxd
 * @email 1520501795@qq.com
 * @date 2022-09-11 14:56:12
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

