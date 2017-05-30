package com.myclouder.upms.server.controller;

import com.github.pagehelper.PageInfo;
import com.myclouder.common.model.Result;
import com.myclouder.upms.rpc.api.UpmsLogService;
import com.myclouder.upms.rpc.dto.UpmsLogDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 日志管理
 *
 * @author yanhaizhe
 * @create 2017-05-26 下午 10:46
 **/
@Controller
@RequestMapping("/manage")
@Api(value = "日志管理", description = "日志管理")
public class UpmsLogController {

    @Autowired
    private UpmsLogService upmsLogService;

    @ApiOperation(value = "日志首页")
    @ResponseBody
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public Result index() {
//        UpmsLogDTO upmsLogDTO = upmsLogService.queryUpmsLogById("1");
//        return Result.success(upmsLogDTO);
        PageInfo<UpmsLogDTO> upmsLogDTOPageInfo = upmsLogService.queryUpmsLogs();
        return Result.success(upmsLogDTOPageInfo);
    }
}
