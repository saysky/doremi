package com.example.sens.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.sens.common.base.BaseEntity;
import com.example.sens.enums.MaintainStatusEnum;
import lombok.Data;

/**
 * 维修模块
 *
 * @author 言曌
 * @date 2021/4/20 9:06 下午
 */
@TableName("maintain")
@Data
public class Maintain extends BaseEntity {

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
     * 维修金额
     */
    private Integer money;

    /**
     * @see com.example.sens.enums.MaintainStatusEnum
     * 状态：待维修，pending,维修好了success,维修失败failed
     */
    private String status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 订单ID
     */
    private Long orderId;

    public String getStatusStr() {
        return MaintainStatusEnum.getMessage(this.status);
    }
}
