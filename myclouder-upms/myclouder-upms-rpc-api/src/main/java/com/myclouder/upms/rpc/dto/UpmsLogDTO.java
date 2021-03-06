package com.myclouder.upms.rpc.dto;

import java.io.Serializable;

/**
 * umps日志传输类
 *
 * @author yanhaizhe
 * @create 2017-05-25 上午 10:06
 **/
public class UpmsLogDTO implements Serializable {
    private static final long serialVersionUID = -4214918971204018745L;

    private String id;

    private String type;

    private String description;

    private String createBy;

    private Integer gmtCreate;

    private Integer spendTime;

    private String remoteAddr;

    private String userAgent;

    private String requestUri;

    private String method;

    /**
     * 获取 编号 字段:upms_log.id
     *
     * @return upms_log.id, 编号
     */
    public String getId() {
        return id;
    }

    /**
     * 设置 编号 字段:upms_log.id
     *
     * @param id the value for upms_log.id, 编号
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取 日志类型（1：接入日志；2：错误日志） 字段:upms_log.type
     *
     * @return upms_log.type, 日志类型（1：接入日志；2：错误日志）
     */
    public String getType() {
        return type;
    }

    /**
     * 设置 日志类型（1：接入日志；2：错误日志） 字段:upms_log.type
     *
     * @param type the value for upms_log.type, 日志类型（1：接入日志；2：错误日志）
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 获取 日志标题 字段:upms_log.description
     *
     * @return upms_log.description, 日志标题
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置 日志标题 字段:upms_log.description
     *
     * @param description the value for upms_log.description, 日志标题
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 获取 创建者 字段:upms_log.create_by
     *
     * @return upms_log.create_by, 创建者
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 设置 创建者 字段:upms_log.create_by
     *
     * @param createBy the value for upms_log.create_by, 创建者
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * 获取 创建时间 字段:upms_log.gmt_create
     *
     * @return upms_log.gmt_create, 创建时间
     */
    public Integer getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 设置 创建时间 字段:upms_log.gmt_create
     *
     * @param gmtCreate the value for upms_log.gmt_create, 创建时间
     */
    public void setGmtCreate(Integer gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 获取 消耗时间 字段:upms_log.spend_time
     *
     * @return upms_log.spend_time, 消耗时间
     */
    public Integer getSpendTime() {
        return spendTime;
    }

    /**
     * 设置 消耗时间 字段:upms_log.spend_time
     *
     * @param spendTime the value for upms_log.spend_time, 消耗时间
     */
    public void setSpendTime(Integer spendTime) {
        this.spendTime = spendTime;
    }

    /**
     * 获取 操作IP地址 字段:upms_log.remote_addr
     *
     * @return upms_log.remote_addr, 操作IP地址
     */
    public String getRemoteAddr() {
        return remoteAddr;
    }

    /**
     * 设置 操作IP地址 字段:upms_log.remote_addr
     *
     * @param remoteAddr the value for upms_log.remote_addr, 操作IP地址
     */
    public void setRemoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr == null ? null : remoteAddr.trim();
    }

    /**
     * 获取 用户代理 字段:upms_log.user_agent
     *
     * @return upms_log.user_agent, 用户代理
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * 设置 用户代理 字段:upms_log.user_agent
     *
     * @param userAgent the value for upms_log.user_agent, 用户代理
     */
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent == null ? null : userAgent.trim();
    }

    /**
     * 获取 请求URI 字段:upms_log.request_uri
     *
     * @return upms_log.request_uri, 请求URI
     */
    public String getRequestUri() {
        return requestUri;
    }

    /**
     * 设置 请求URI 字段:upms_log.request_uri
     *
     * @param requestUri the value for upms_log.request_uri, 请求URI
     */
    public void setRequestUri(String requestUri) {
        this.requestUri = requestUri == null ? null : requestUri.trim();
    }

    /**
     * 获取 操作方式 字段:upms_log.method
     *
     * @return upms_log.method, 操作方式
     */
    public String getMethod() {
        return method;
    }

    /**
     * 设置 操作方式 字段:upms_log.method
     *
     * @param method the value for upms_log.method, 操作方式
     */
    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }
}
