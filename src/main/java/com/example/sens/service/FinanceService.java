package com.example.sens.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.sens.common.base.BaseService;
import com.example.sens.entity.Check;
import com.example.sens.entity.Finance;

/**
 * @author 言曌
 * @date 2021/4/21 9:38 下午
 */
public interface FinanceService extends BaseService<Finance, Long> {

    /**
     * 根据时间范围查询总金额
     *
     * @param startDate
     * @param endDate
     * @return
     */
    Integer getTotalPriceSum(String startDate, String endDate);

    /**
     * 根据时间范围查询
     * @param startDate
     * @param endDate
     * @param page
     * @return
     */
    Page<Finance> findAll(String startDate, String endDate, Page<Finance> page);
}
