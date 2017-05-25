package com.myclouder.upms.dal.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;

public class UpmsLogWithBLOBs extends UpmsLog {

    @ApiModelProperty(value="操作提交的数据",name="params")
    @Column(name = "params")
    private String params;

    @ApiModelProperty(value="异常信息",name="exception")
    @Column(name = "exception")
    private String exception;

    /**
     * 获取 操作提交的数据 字段:upms_log.params
     *
     * @return upms_log.params, 操作提交的数据
     */
    public String getParams() {
        return params;
    }

    /**
     * 设置 操作提交的数据 字段:upms_log.params
     *
     * @param params the value for upms_log.params, 操作提交的数据
     */
    public void setParams(String params) {
        this.params = params == null ? null : params.trim();
    }

    /**
     * 获取 异常信息 字段:upms_log.exception
     *
     * @return upms_log.exception, 异常信息
     */
    public String getException() {
        return exception;
    }

    /**
     * 设置 异常信息 字段:upms_log.exception
     *
     * @param exception the value for upms_log.exception, 异常信息
     */
    public void setException(String exception) {
        this.exception = exception == null ? null : exception.trim();
    }
}