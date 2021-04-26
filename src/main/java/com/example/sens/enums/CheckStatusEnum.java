package com.example.sens.enums;


/**
 * <pre>
 *     检查状态
 * </pre>
 *
 * @author : saysky
 * @date 2021/4/17
 */
public enum CheckStatusEnum {
    /**
     * 未检查
     */
    NOT_CHECK("not_check", "未检查"),

    /**
     * 检查正常
     */
    CHECK_NORMAL("check_normal", "检查正常"),

    /**
     * 检查异常
     */
    CHECK_ABNORMAL("check_abnormal", "检查异常"),


    ;


    private String code;

    private String message;

    CheckStatusEnum(String code, String message) {
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
        for (CheckStatusEnum ele : values()) {
            if (ele.getCode().equals(code)) {
                return ele.getMessage();
            }
        }
        return null;
    }


}
