package com.example.sens.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sens.entity.Outbound;
import com.example.sens.enums.OutboundStatusEnum;
import com.example.sens.mapper.OutboundMapper;
import com.example.sens.service.OutboundService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 言曌
 * @date 2021/4/21 9:41 下午
 */
@Service
public class OutboundServiceImpl implements OutboundService {

    @Autowired
    private OutboundMapper outboundMapper;

    @Override
    public BaseMapper<Outbound> getRepository() {
        return outboundMapper;
    }

    @Override
    public QueryWrapper<Outbound> getQueryWrapper(Outbound object) {
        //对指定字段查询
        QueryWrapper<Outbound> queryWrapper = new QueryWrapper<>();
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

    @Override
    public void updateStatusByOrderId(Long orderId, OutboundStatusEnum status) {
        Map<String, Object> map = new HashMap<>();
        map.put("order_id", orderId);
        List<Outbound> outboundList = outboundMapper.selectByMap(map);
        for (Outbound temp : outboundList) {
            temp.setStatus(status.getCode());
            outboundMapper.updateById(temp);
        }
    }
}
