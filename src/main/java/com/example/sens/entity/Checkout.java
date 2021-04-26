package com.example.sens.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.sens.common.base.BaseEntity;
import com.example.sens.enums.CheckStatusEnum;
import com.example.sens.enums.CheckoutStatusEnum;
import lombok.Data;

/**
 * 结算信息
 *
 * @author 言曌
 * @date 2021/4/20 9:06 下午
 */
@TableName("checkout")
@Data
public class Checkout extends BaseEntity {

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 器材ID
     */
    private Long postId;

    /**
     * 器材编号
     */
    private String postNumber;

    /**
     * 器材名称
     */
    private String postTitle;

    /**
     * 退回金额
     */
    private Integer totalReturn;

    /**
     * 备注
     */
    private String remark;

    /**
     * 状态
     * @see com.example.sens.enums.CheckStatusEnum
     */
    private String status;


    public String getStatusStr() {
        return CheckoutStatusEnum.getMessage(this.status);
    }
}
