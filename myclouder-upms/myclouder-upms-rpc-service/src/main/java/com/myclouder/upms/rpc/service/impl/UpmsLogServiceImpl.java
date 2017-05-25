package com.myclouder.upms.rpc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.myclouder.common.util.BeanUtil;
import com.myclouder.upms.dal.mapper.UpmsLogMapper;
import com.myclouder.upms.dal.model.UpmsLog;
import com.myclouder.upms.rpc.api.UpmsLogService;
import com.myclouder.upms.rpc.dto.UpmsLogDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yanhaizhe
 * @create 2017-05-25 上午 10:10
 **/
@Service
public class UpmsLogServiceImpl implements UpmsLogService {
    private static final Logger log = LoggerFactory.getLogger(UpmsLogServiceImpl.class);

    @Autowired
    private UpmsLogMapper upmsLogMapper;

    @Override
    public UpmsLogDTO queryUpmsLogById(String logId) {
        log.info("UpmsLogService queryUpmsLogById~~~~~~~~~~~~~~~~~~~");
        UpmsLog upmsLog = upmsLogMapper.selectByPrimaryKey(logId);
        UpmsLogDTO upmsLogDTO = new UpmsLogDTO();
        BeanUtil.copyProperties(upmsLog, upmsLogDTO);
        return upmsLogDTO;
    }

    @Override
    public PageInfo<UpmsLogDTO> queryUpmsLogs() {
        log.info("UpmsLogService queryUpmsLogs~~~~~~~~~~~~~~~~~~~");
        PageHelper.startPage(1, 10);
        UpmsLog upmsLog = new UpmsLog();
        List<UpmsLog> upmsLogList = upmsLogMapper.select(upmsLog);
        List<UpmsLogDTO> upmsLogDTOS = BeanUtil.copyList(upmsLogList, UpmsLogDTO.class);
        PageInfo<UpmsLogDTO> pageInfo = new PageInfo<>(upmsLogDTOS);
        return pageInfo;
    }
}
