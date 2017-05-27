package com.myclouder.upms.rpc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 服务启动类
 *
 * @author yanhaizhe
 * @create 2017-05-27 上午 11:17
 **/
public class MyclouderUpmsRpcServiceApplication {
    private static Logger _log = LoggerFactory.getLogger(MyclouderUpmsRpcServiceApplication.class);

    public static void main(String[] args) throws IOException {
        _log.info(">>>>> myclouder-upms-rpc-service 正在启动 <<<<<");
        new ClassPathXmlApplicationContext("classpath:/spring/*.xml").start();
        _log.info(">>>>> myclouder-upms-rpc-service 启动完成 <<<<<");
        System.in.read();
    }
}
