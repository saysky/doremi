package com.example.sens.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sens.entity.Maintain;
import com.example.sens.mapper.MaintainMapper;
import com.example.sens.service.MaintainService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 言曌
 * @date 2021/4/21 9:41 下午
 */
@Service
public class MaintainServiceImpl implements MaintainService {

    @Autowired
    private MaintainMapper maintainMapper;

    @Override
    public BaseMapper<Maintain> getRepository() {
        return maintainMapper;
    }

    @Override
    public QueryWrapper<Maintain> getQueryWrapper(Maintain object) {
        //对指定字段查询
        QueryWrapper<Maintain> queryWrapper = new QueryWrapper<>();
        if (object != null) {
            if (object.getPostId() != null) {
                queryWrapper.eq("post_id", object.getPostId());
            }

            if (StringUtils.isNotEmpty(object.getStatus())) {
                queryWrapper.eq("status", object.getStatus());
            }

        }
        return queryWrapper;
    }

    @Override
    public Maintain findByOrderId(Long orderId) {
        return maintainMapper.findByOrderId(orderId);
    }
}
