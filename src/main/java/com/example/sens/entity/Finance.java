package com.example.sens.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.sens.common.base.BaseEntity;
import com.example.sens.enums.CheckStatusEnum;
import com.example.sens.enums.FinanceTypeEnum;
import lombok.Data;

/**
 * 财务
 * @author 言曌
 * @date 2021/4/20 9:34 下午
 */

@TableName("finance")
@Data
public class Finance extends BaseEntity {

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
     * 用户ID
     */
    private Long userId;

    /**
     * 类型
     * @see com.example.sens.enums.FinanceTypeEnum
     */
    private String type;

    /**
     * 金额
     */
    private Integer money;

    public String getTypeStr() {
        return FinanceTypeEnum.getMessage(this.type);
    }

}
