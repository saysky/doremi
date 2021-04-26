package com.example.sens.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sens.entity.Checkout;
import com.example.sens.mapper.CheckoutMapper;
import com.example.sens.service.CheckoutService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 言曌
 * @date 2021/4/21 9:41 下午
 */
@Service
public class CheckoutServiceImpl implements CheckoutService {

    @Autowired
    private CheckoutMapper checkoutMapper;

    @Override
    public BaseMapper<Checkout> getRepository() {
        return checkoutMapper;
    }

    @Override
    public QueryWrapper<Checkout> getQueryWrapper(Checkout object) {
        //对指定字段查询
        QueryWrapper<Checkout> queryWrapper = new QueryWrapper<>();
        if (object != null) {
            if (object.getOrderId() != null) {
                queryWrapper.eq("order_id", object.getOrderId());
            }
            if (object.getPostId() != null) {
                queryWrapper.eq("post_id", object.getPostId());
            }
            if (StringUtils.isNotEmpty(object.getStatus())) {
                queryWrapper.eq("status", object.getStatus());
            }

        }
        return queryWrapper;
    }
}
