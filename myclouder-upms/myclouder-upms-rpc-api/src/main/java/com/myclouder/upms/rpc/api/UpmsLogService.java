package com.myclouder.upms.rpc.api;

import com.github.pagehelper.PageInfo;
import com.myclouder.upms.rpc.dto.UpmsLogDTO;

import java.util.List;

/**
 * upms日志接口
 *
 * @author yanhaizhe
 * @create 2017-05-25 上午 10:03
 **/
public interface UpmsLogService {

    /**
     * 日志查询
     * @param logId
     * @return
     */
    UpmsLogDTO queryUpmsLogById(String logId);

    PageInfo<UpmsLogDTO> queryUpmsLogs();

}
