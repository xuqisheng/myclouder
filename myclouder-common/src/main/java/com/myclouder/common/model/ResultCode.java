package com.myclouder.common.model;

/**
 * 常见返回rpc结果code
 *
 * @author yanhaizhe
 * @create 2017-05-21 下午 10:01
 **/
public enum ResultCode {
    SUCCESS("200", "操作成功"),
    FAIL("500", "系统繁忙");

    private String code;
    private String message;

    ResultCode(String code, String message) {
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
}
