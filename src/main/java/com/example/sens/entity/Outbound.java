package com.example.sens.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.sens.common.base.BaseEntity;
import com.example.sens.enums.MaintainStatusEnum;
import com.example.sens.enums.OutboundStatusEnum;
import lombok.Data;

import java.util.Date;

/**
 * 出库信息
 *
 * @author 言曌
 * @date 2021/4/20 9:06 下午
 */
@TableName("outbound")
@Data
public class Outbound extends BaseEntity {

    /**
     * 订单ID
     */
    private Long orderId;


    /**
     * 商品ID
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
     * 快递公司
     */
    private String expressCompany;

    /**
     * 快递单号
     */
    private String expressNo;

    /**
     * 发货日期
     */
    private Date sendDate;

    /**
     * 收货日期
     */
    private Date takeDate;

    /**
     * 状态：
     * @see com.example.sens.enums.OutboundStatusEnum
     */
    private String status;

    public String getStatusStr() {
        return OutboundStatusEnum.getMessage(this.status);
    }
}
