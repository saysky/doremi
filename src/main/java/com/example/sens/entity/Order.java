package com.example.sens.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.sens.common.base.BaseEntity;
import com.example.sens.enums.OrderStatusEnum;
import lombok.Data;

import java.util.Date;

/**
 * 订单
 *
 * @author 言曌
 * @date 2021/4/17
 */
@Data
@TableName("t_order")
public class Order extends BaseEntity {

    /**
     * 下单用户ID，租客ID
     */
    private Long userId;

    /**
     * 设备ID
     */
    private Long postId;

    /**
     * 开始日期
     */
    private Date startDate;

    /**
     * 结束日期
     */
    private Date endDate;

    /**
     * 续借日期
     */
    private Date extendDate;

    /**
     * 商品名称
     */
    private String postTitle;

    /**
     * 商品编号
     */
    private String postNumber;

    /**
     * 订单状态，
     *
     * @see com.example.sens.enums.OrderStatusEnum
     */
    private String status;

    /**
     * 器材日租金
     */
    private Integer dayPrice;

    /**
     * 数量，租借天数
     */
    private Integer dayNum;


    /**
     * 续借了多少天
     */
    private Integer extendDayNum;

    /**
     * 总共支付
     */
    private Integer totalPay;


    /**
     * 总共退回
     */
    private Integer totalReturn;

    /**
     * 押金
     */
    private Integer deposit;

    /**
     * 租客姓名
     */
    private String userName;

    /**
     * 租客电话
     */
    private String userPhone;

    /**
     * 租客地址
     */
    private String userAddress;

    /**
     * 逾期天数
     */
    private Integer overDayNum;

    /**
     * 设备
     */
    @TableField(exist = false)
    private Post post;

    /**
     * 下单用户
     */
    @TableField(exist = false)
    private User user;


    /**
     * 状态描述
     */
    @TableField(exist = false)
    private String statusStr;


    public String getStatusStr() {
        return OrderStatusEnum.getMessage(this.status);
    }
}
