package com.example.sens.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sens.entity.Check;
import com.example.sens.entity.Order;
import com.example.sens.mapper.CheckMapper;
import com.example.sens.service.CheckService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 言曌
 * @date 2021/4/21 9:41 下午
 */
@Service
public class CheckServiceImpl implements CheckService {

    @Autowired
    private CheckMapper checkMapper;

    @Override
    public BaseMapper<Check> getRepository() {
        return checkMapper;
    }

    @Override
    public QueryWrapper<Check> getQueryWrapper(Check object) {
        //对指定字段查询
        QueryWrapper<Check> queryWrapper = new QueryWrapper<>();
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
