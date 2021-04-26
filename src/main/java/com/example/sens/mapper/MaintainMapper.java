package com.example.sens.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sens.entity.Maintain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author 言曌
 * @date 2021/4/20 10:49 下午
 */
@Mapper
public interface MaintainMapper extends BaseMapper<Maintain> {

    /**
     * 根据订单ID查询
     * @param orderId
     * @return
     */
    @Select(("select * from maintain where order_id = #{orderId} and del_flag = 0 limit 1"))
    Maintain findByOrderId(Long orderId);
}
