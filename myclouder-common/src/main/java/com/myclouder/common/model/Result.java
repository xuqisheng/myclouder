package com.myclouder.common.model;

import java.io.Serializable;

/**
 * 统一返回结果类
 *
 * @author yanhaizhe
 * @create 2017-05-14 下午 12:25
 **/
public class Result<T> implements Serializable {

    private static final long serialVersionUID = -927544607883280858L;

    // 状态码：1成功，其他为失败
    public String code;

    // 成功为success，其他为失败原因
    public String message;

    // 数据结果集
    public T data;

    public Result(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result(T data) {
        this(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);
    }

    public static <T extends Serializable> Result<T> success(T data) {
        return new Result<T>(data);
    }

    public static Result fail(String code, String message) {
        return new Result(code, message);
    }

    public boolean isSuccess() {
        return ResultCode.SUCCESS.getCode().equals(code);
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
