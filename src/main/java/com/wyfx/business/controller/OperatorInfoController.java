package com.wyfx.business.controller;

import com.google.gson.Gson;
import com.wyfx.business.controller.commons.MyResponseEntity;
import com.wyfx.business.controller.commons.ResponseCode;
import com.wyfx.business.entity.OperatorInfo;
import com.wyfx.business.service.OperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * @author jackdong
 * @date 2019/12/19
 * @description 操作日志管理
 */
@Controller
@RequestMapping("/OperatorInfo")
public class OperatorInfoController {

    @Autowired
    private OperatorService operatorService;

    @Autowired
    private Gson gson;

    private int pageSize = 5;

    /**
     * 查询单个日志操作信息
     * @param uid
     * @return
     */

    @RequestMapping("/getOperatorInfo")
    @ResponseBody
    public Object getOperatorInfo(@RequestParam(value = "uid", defaultValue = "0") int uid) {
        List<OperatorInfo> list = operatorService.getOperatorInfo(uid);
        return new MyResponseEntity<>(ResponseCode.SUCCESS.getValue(), list);
    }

    /**
     * 获取所有操作日志信息
     * @return
     */
    @RequestMapping("/getAllOperatorInfo")
    @ResponseBody
    public Object getAllOperatorInfo() {
        List<OperatorInfo> list = operatorService.getAllOperatorInfo();
        return new MyResponseEntity<>(ResponseCode.SUCCESS.getValue(), list);
    }

    /**
     * 添加日志操作信息
     * @param operatorInfo
     * @return
     */
    @RequestMapping("/addOperator")
    @ResponseBody
    public Object addOperator(@RequestBody OperatorInfo operatorInfo) {
        operatorService.addOperator(operatorInfo);
        return new MyResponseEntity<>(ResponseCode.SUCCESS.getValue());
    }

    /**
     * 更新日志操作信息
     * @param operatorInfo
     * @return
     */
    @RequestMapping("/updateOperator")
    @ResponseBody
    public Object updateOperator(@RequestBody OperatorInfo operatorInfo) {
        operatorService.updateOperator(operatorInfo);
        return new MyResponseEntity<>(ResponseCode.SUCCESS.getValue());
    }

    /**
     * 删除日志操作信息
     * @param uid
     * @return
     */
    @RequestMapping("/deleteOperator")
    @ResponseBody
    public Object deleteOperator(@RequestParam(value = "uid", defaultValue = "0") int uid) {
        operatorService.deleteOperator(uid);
        return new MyResponseEntity<>(ResponseCode.SUCCESS.getValue());
    }

    /**
     * 通过操作员名称查找日志操作信息集合
     * @param operator
     * @return
     */
    @RequestMapping("/selectOperatorByName")
    @ResponseBody
    public Object selectOperatorByName(@RequestParam(value = "operator", defaultValue = "000") String operator) {
        List<OperatorInfo> list = operatorService.selectOperatorByName(operator);
        return new MyResponseEntity<>(ResponseCode.SUCCESS.getValue(), list);
    }

    /**
     * 分页查找日志操作信息
     * @param currPage
     * @return
     */
    @RequestMapping("/selectOperatorByPage")
    @ResponseBody
    public Object selectOperatorByPage(@RequestParam(value = "page", defaultValue = "1") int currPage) {
        HashMap<String, Object> data = new HashMap<String, Object>();
        data.put("currIndex", (currPage - 1) * pageSize);
        data.put("pageSize", pageSize);
        List<OperatorInfo> list = operatorService.selectOperatorByPage(data);
        return new MyResponseEntity<>(ResponseCode.SUCCESS.getValue(), list);
    }

}