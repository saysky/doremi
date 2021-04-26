package com.example.sens.service;

import com.example.sens.common.base.BaseService;
import com.example.sens.entity.Order;

import java.util.List;

/**
 * 订单
 *
 * @author 言曌
 * @date 2021/4/17
 */
public interface OrderService extends BaseService<Order, Long> {


    /**
     * 查询是否有订单
     *
     * @param userId
     * @param postId
     * @return
     */
    List<Order> findByUserIdAndPostId(Long userId, Long postId);
}
