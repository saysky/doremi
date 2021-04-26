package com.example.sens.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.sens.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author liuyanzhao
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

    /**
     * 获得到期的订单
     *
     * @return
     */
    List<Order> findOverDueOrder();

    /**
     * 查询是否有订单
     *
     * @param userId
     * @param postId
     * @return
     */
    List<Order> findByUserIdAndPostId(@Param("userId") Long userId,
                                      @Param("postId") Long postId);
}

