package com.example.sens.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.sens.common.base.BaseEntity;
import com.example.sens.enums.CheckStatusEnum;
import com.example.sens.enums.InboundStatusEnum;
import lombok.Data;

/**
 * @author 言曌
 * @date 2021/4/20 9:34 下午
 */

@TableName("t_check")
@Data
public class Check extends BaseEntity {

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
     * 状态
     * @see com.example.sens.enums.CheckStatusEnum
     */
    private String status;

    /**
     * 备注
     */
    private String remark;



    public String getStatusStr() {
        return CheckStatusEnum.getMessage(this.status);
    }

}
