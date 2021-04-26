package com.example.sens.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.sens.common.base.BaseEntity;
import com.example.sens.util.RelativeDateFormat;
import lombok.Data;

/**
 * 评论
 *
 * @author 言曌
 * @date 2021/4/18 6:11 下午
 */
@TableName("comment")
@Data
public class Comment extends BaseEntity {

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 设备ID
     */
    private Long postId;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 用户
     */
    @TableField(exist = false)
    private User user;

    /**
     * 创建时间
     */
    @TableField(exist = false)
    private String createTimeStr;


    public String getCreateTimeStr() {
        return RelativeDateFormat.format(getCreateTime());
    }
}
