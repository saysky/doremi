package com.example.sens.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.sens.entity.Finance;
import com.example.sens.mapper.FinanceMapper;
import com.example.sens.service.FinanceService;
import com.example.sens.service.FinanceService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 言曌
 * @date 2021/4/21 9:41 下午
 */
@Service
public class FinanceServiceImpl implements FinanceService {

    @Autowired
    private FinanceMapper financeMapper;

    @Override
    public BaseMapper<Finance> getRepository() {
        return financeMapper;
    }

    @Override
    public QueryWrapper<Finance> getQueryWrapper(Finance object) {
        //对指定字段查询
        QueryWrapper<Finance> queryWrapper = new QueryWrapper<>();
        if (object != null) {
            if (object.getOrderId() != null) {
                queryWrapper.eq("order_id", object.getOrderId());
            }
            if (object.getPostId() != null) {
                queryWrapper.eq("post_id", object.getPostId());
            }
            if (object.getUserId() != null) {
                queryWrapper.eq("user_id", object.getUserId());
            }


        }
        return queryWrapper;
    }

    @Override
    public Integer getTotalPriceSum(String startDate, String endDate) {
        return financeMapper.getMoneySumByCreateTimeRange(startDate, endDate);
    }

    @Override
    public Page<Finance> findAll(String startDate, String endDate, Page<Finance> page) {
        return page.setRecords(financeMapper.findAllByCreateTimeRange(startDate, endDate, page));
    }
}
