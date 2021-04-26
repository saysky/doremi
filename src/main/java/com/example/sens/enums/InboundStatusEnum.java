package com.example.sens.enums;


/**
 * <pre>
 *     入库状态
 * </pre>
 *
 * @author : saysky
 * @date 2021/4/17
 */
public enum InboundStatusEnum {



    /**
     * 待收货
     */
    NOT_TAKE("not_take", "待入库"),

    /**
     * 已收货
     */
    HAS_TAKE("has_take", "已入库"),


    ;


    private String code;

    private String message;

    InboundStatusEnum(String code, String message) {
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
        for (InboundStatusEnum ele : values()) {
            if (ele.getCode().equals(code)) {
                return ele.getMessage();
            }
        }
        return null;
    }


}
