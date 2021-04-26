package com.example.sens.config.schedule;

import com.example.sens.entity.Order;
import com.example.sens.enums.OrderStatusEnum;
import com.example.sens.mapper.OrderMapper;
import com.example.sens.mapper.PostMapper;
import com.example.sens.mapper.UserMapper;
import com.example.sens.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * 定时器
 *
 * @author 言曌
 * @date 2021/4/17
 */
@Component
public class SystemSchedule {

    @Autowired
    private OrderMapper orderMapper;


    /**
     * 将逾期的订单更新状态和逾期天数
     */
    @Scheduled(fixedRate = 10000)
    @Transactional(rollbackFor = Exception.class)
    public void updateOverTimeOrder() {
        List<Order> orderList = orderMapper.findOverDueOrder();
        for (Order order : orderList) {

            try {
                Date now = new Date();
                Date endDate = order.getEndDate();
                if (endDate.before(now)) {
                    Integer overDayNum = DateUtil.daysBetween(endDate, now);
                    if (overDayNum > 0) {
                        // 更新逾期天数和订单状态
                        order.setStatus(OrderStatusEnum.OVERDUE.getCode());
                        order.setOverDayNum(overDayNum);
                        orderMapper.updateById(order);
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }


    }

}
