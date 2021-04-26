package com.example.sens.enums;


/**
 * 订单状态enum
 *
 * @author liuyanzhao
 */
public enum OrderStatusEnum {


    /**
     * 待支付
     */
    NOT_PAY("not_pay", "待支付"),


    /**
     * 已取消
     */
    HAS_CANCEL("canceled", "租客已取消"),

    /**
     * 已支付，待审核
     */
    NOT_CHECK("not_check", "待审核"),

    /**
     * 审核不通过
     */
    CHECK_REJECT("reject", "审核不通过"),

    /**
     * 审核通过，待发货
     */
    NOT_SEND("not_send", "待发货"),

    /**
     * 已发货，未收货
     */
    NOT_TAKE("not_take", "待收货"),

    /**
     * 已收货
     */
    HAS_TAKE("has_take", "已收货"),

    /**
     * 已归还
     */
    HAS_RETURN("has_return", "归还已发货"),

    /**
     * 已逾期
     */
    OVERDUE("overdue", "已逾期"),


    /**
     * 归还待检查
     */
    RETURN_NOT_CHECK("return_not_check", "归还收货待检查"),

    /**
     * 收货已检查
     */
    RETURN_HAS_CHECK("return_has_check", "检查完毕待结算"),
    /**
     * 已结算
     */
    HAS_CHECKOUT("has_checkout", "已结算"),

    /**
     * 已关闭
     */
    CLOSE("close", "已关闭"),

    ;


    private String code;

    private String message;

    OrderStatusEnum(String code, String message) {
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
        for (OrderStatusEnum ele : values()) {
            if (ele.getCode().equals(code)) {
                return ele.getMessage();
            }
        }
        return null;
    }

}
