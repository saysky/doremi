package com.example.sens.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sens.entity.Inbound;
import com.example.sens.mapper.InboundMapper;
import com.example.sens.service.InboundService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 言曌
 * @date 2021/4/21 9:41 下午
 */
@Service
public class InboundServiceImpl implements InboundService {

    @Autowired
    private InboundMapper inboundMapper;

    @Override
    public BaseMapper<Inbound> getRepository() {
        return inboundMapper;
    }

    @Override
    public QueryWrapper<Inbound> getQueryWrapper(Inbound object) {
        //对指定字段查询
        QueryWrapper<Inbound> queryWrapper = new QueryWrapper<>();
        if (object != null) {
            if (object.getPostId() != null) {
                queryWrapper.eq("post_id", object.getPostId());
            }
            if (object.getOrderId() != null) {
                queryWrapper.eq("order_id", object.getOrderId());
            }
            if (StringUtils.isNotEmpty(object.getStatus())) {
                queryWrapper.eq("status", object.getStatus());
            }

        }
        return queryWrapper;
    }
}
