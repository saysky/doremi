package com.example.sens.enums;


/**
 * <pre>
 *     器材状态enum
 * </pre>
 *
 * @author : saysky
 * @date 2021/4/17
 */
public enum PostStatusEnum {

    /**
     * 未租出
     */
    ON_SALE("on_sale", "未租出"),

    /**
     * 已出租
     */
    OFF_SALE("off_sale", "已租出"),

    /**
     * 维修中
     */
    MAINTAINING("maintaining", "维修中"),

    /**
     * 已下架
     */
    SCRAP("scrap", "已报废"),

    /**
     * 已下架
     */
    DOWN("down", "已下架"),


    ;


    private String code;

    private String message;

    PostStatusEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static String getMessage(String code) {
        for (PostStatusEnum ele : values()) {
            if (ele.getCode().equals(code)) {
                return ele.getMessage();
            }
        }
        return null;
    }


}
