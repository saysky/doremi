package com.example.sens.enums;


/**
 * <pre>
 *     维修状态enum
 * </pre>
 *
 * @author : saysky
 * @date 2021/4/17
 */
public enum MaintainStatusEnum {

    /**
     * 待维修
     */
    PENDING("pending", "待维修"),

    /**
     * 已出租
     */
    SUCCESS("success", "修好了"),

    /**
     * 维修中
     */
    FAILED("failed", "没修好")

    ;


    private String code;

    private String message;

    MaintainStatusEnum(String code, String message) {
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
        for (MaintainStatusEnum ele : values()) {
            if (ele.getCode().equals(code)) {
                return ele.getMessage();
            }
        }
        return null;
    }


}
