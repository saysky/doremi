package com.example.sens.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.sens.entity.Check;
import com.example.sens.entity.Finance;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 言曌
 * @date 2021/4/20 10:49 下午
 */
@Mapper
public interface FinanceMapper extends BaseMapper<Finance> {


    /**
     * 根据时间范围查询订单
     *
     * @param startDate
     * @param endDate
     * @return
     */
    List<Finance> findAllByCreateTimeRange(@Param("startDate") String startDate,
                                           @Param("endDate") String endDate,
                                           Page page);

    /**
     * 根据时间范围查询总金额
     *
     * @param startDate
     * @param endDate
     * @return
     */
    Integer getMoneySumByCreateTimeRange(@Param("startDate") String startDate,
                                              @Param("endDate") String endDate);
}
