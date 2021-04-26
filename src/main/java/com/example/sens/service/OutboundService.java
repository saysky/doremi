package com.example.sens.service;

import com.example.sens.common.base.BaseService;
import com.example.sens.entity.Inbound;
import com.example.sens.entity.Outbound;
import com.example.sens.enums.OutboundStatusEnum;

/**
 * @author 言曌
 * @date 2021/4/21 9:38 下午
 */
public interface OutboundService extends BaseService<Outbound, Long> {

    /**
     * 根据订单ID更新状态
     *
     * @param orderId
     * @param status
     */
    void updateStatusByOrderId(Long orderId, OutboundStatusEnum status);
}
