package com.myclouder.upms.rpc.service;

import com.github.pagehelper.PageInfo;
import com.myclouder.upms.rpc.api.UpmsLogService;
import com.myclouder.upms.rpc.common.BaseTest;
import com.myclouder.upms.rpc.dto.UpmsLogDTO;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 测试
 *
 * @author yanhaizhe
 * @create 2017-05-25 上午 10:22
 **/

public class UpmsLogServiceTest extends BaseTest {
    private static final Logger log = LoggerFactory.getLogger(UpmsLogServiceTest.class);
    @Autowired
    private UpmsLogService upmsLogService;
    @Test
    public void testUpmsLogById() {
        UpmsLogDTO upmsLogDTO = upmsLogService.queryUpmsLogById("1");
        log.info("测试log4j2~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(upmsLogDTO.getRemoteAddr());
    }

    @Test
    public void testList() {
        PageInfo<UpmsLogDTO> pageInfo = upmsLogService.queryUpmsLogs();
        log.info("测试log4j2~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(pageInfo.toString());
    }
}
