package com.example.sens.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.sens.entity.Order;
import com.example.sens.mapper.OrderMapper;
import com.example.sens.service.OrderService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 言曌
 * @date 2021/4/17
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public BaseMapper<Order> getRepository() {
        return orderMapper;
    }

    @Override
    public QueryWrapper<Order> getQueryWrapper(Order order) {
        //对指定字段查询
        QueryWrapper<Order> queryWrapper = new QueryWrapper<>();
        if (order != null) {
            if (order.getUserId() != null) {
                queryWrapper.eq("user_id", order.getUserId());
            }
            if (order.getPostId() != null) {
                queryWrapper.eq("post_id", order.getPostId());
            }
            if (StringUtils.isNotEmpty(order.getStatus())) {
                queryWrapper.eq("status", order.getStatus());
            }
            if (order.getStartDate() != null) {
                queryWrapper.eq("start_date", order.getStartDate());
            }
            if (order.getEndDate() != null) {
                queryWrapper.eq("end_date", order.getEndDate());
            }
        }
        return queryWrapper;
    }

    @Override
    public List<Order> findByUserIdAndPostId(Long userId, Long postId) {
        return orderMapper.findByUserIdAndPostId(userId, postId);
    }
}
