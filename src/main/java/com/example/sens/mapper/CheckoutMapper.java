package com.example.sens.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sens.entity.Check;
import com.example.sens.entity.Checkout;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 言曌
 * @date 2021/4/20 10:49 下午
 */
@Mapper
public interface CheckoutMapper extends BaseMapper<Checkout> {
}
