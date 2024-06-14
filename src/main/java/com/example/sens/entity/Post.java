package com.example.sens.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.sens.common.base.BaseEntity;
import com.example.sens.enums.OrderStatusEnum;
import com.example.sens.enums.PostStatusEnum;
import lombok.Data;


/**
 * @author example
 */
@Data
@TableName("post")
public class Post extends BaseEntity {

    /**
     * 用户ID
     */
    private Long userId;
    /**
     * 标题
     */
    private String postTitle;

    /**
     * 描述
     */
    private String postContent;

    /**
     * 摘要
     */
    private String postSummary;

    /**
     * 缩略图
     */
    private String postThumbnail;

    /**
     * @see com.example.sens.enums.PostStatusEnum
     */
    private String postStatus;

    /**
     * 日租金
     */
    private Integer dayPrice;

    /**
     * 设备编号
     */
    private String number;

    /**
     * 图片URL
     */
    private String imgUrl;

    /**
     * 富文本
     */
    private String postEditor;

    /**
     * 押金
     */
    private Integer deposit;

    /**
     * 品牌
     */
    private String brand;

    /**
     * 型号
     */
    private String model;


    public String getStatusStr() {
        return PostStatusEnum.getMessage(this.postStatus);
    }
