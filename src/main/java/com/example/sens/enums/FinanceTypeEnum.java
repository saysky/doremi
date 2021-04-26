package com.example.sens.enums;


/**
 * <pre>
 *     财务类型
 * </pre>
 *
 * @author : saysky
 * @date 2021/4/17
 */
public enum FinanceTypeEnum {

    /**
     * 租金+押金
     */
    RENT_AND_DEPOSIT("rent_and_deposit", "租金+押金收入"),

//    /**
//     * 押金
//     */
//    DEPOSIT("deposit", "押金收入"),

    /**
     * 维修支出
     */
    MAINTAIN("maintain", "维修支出"),


    /**
     * 结算退回押金支出
     */
    CHECKOUT_RETURN_DEPOSIT("checkout_return_deposit", "结算退回押金支出"),


    ;


    private String code;

    private String message;

    FinanceTypeEnum(String code, String message) {
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
        for (FinanceTypeEnum ele : values()) {
            if (ele.getCode().equals(code)) {
                return ele.getMessage();
            }
        }
        return null;
    }


}
