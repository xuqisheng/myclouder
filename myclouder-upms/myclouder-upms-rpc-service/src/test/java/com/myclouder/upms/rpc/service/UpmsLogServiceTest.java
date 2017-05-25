package com.myclouder.upms.rpc.service;

import com.github.pagehelper.PageInfo;
import com.myclouder.upms.rpc.api.UpmsLogService;
import com.myclouder.upms.rpc.dto.UpmsLogDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试
 *
 * @author yanhaizhe
 * @create 2017-05-25 上午 10:22
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:applicationContext.xml"
})
public class UpmsLogServiceTest {
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
