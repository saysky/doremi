package com.example.sens.service;

import com.example.sens.common.base.BaseService;
import com.example.sens.entity.Maintain;
import com.example.sens.entity.Order;
import com.example.sens.entity.Outbound;

/**
 * @author 言曌
 * @date 2021/4/21 9:38 下午
 */
public interface MaintainService extends BaseService<Maintain, Long> {

    /**
     * 根据订单ID查询
     * @param orderId
     * @return
     */
    Maintain findByOrderId(Long orderId);
}
