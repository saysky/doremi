package com.example.sens.enums;


/**
 * <pre>
 *     出库状态
 * </pre>
 *
 * @author : saysky
 * @date 2021/4/17
 */
public enum OutboundStatusEnum {
    /**
     * 待发货
     */
    NOT_SEND("not_send", "待发货"),

    /**
     * 待收货
     */
    NOT_TAKE("not_take", "待收货"),

    /**
     * 已收货
     */
    HAS_TAKE("has_take", "已收货"),


    ;


    private String code;

    private String message;

    OutboundStatusEnum(String code, String message) {
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
        for (OutboundStatusEnum ele : values()) {
            if (ele.getCode().equals(code)) {
                return ele.getMessage();
            }
        }
        return null;
    }


}
