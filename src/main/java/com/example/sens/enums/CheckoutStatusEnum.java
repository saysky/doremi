package com.example.sens.enums;


/**
 * <pre>
 *     检查状态
 * </pre>
 *
 * @author : saysky
 * @date 2021/4/17
 */
public enum CheckoutStatusEnum {

    /**
     * 待结算
     */
    NOT_CHECKOUT("not_checkout", "待结算"),

    /**
     * 已结算
     */
    HAS_CHECKOUT("has_checkout", "已结算"),


    ;


    private String code;

    private String message;

    CheckoutStatusEnum(String code, String message) {
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
        for (CheckoutStatusEnum ele : values()) {
            if (ele.getCode().equals(code)) {
                return ele.getMessage();
            }
        }
        return null;
    }


}
