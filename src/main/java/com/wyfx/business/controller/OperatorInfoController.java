package com.wyfx.business.controller;

import com.wyfx.business.entity.OperatorInfo;
import com.wyfx.business.service.OperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

//@RestController
@Controller
@RequestMapping("/OperatorInfo")
public class OperatorInfoController {

    @Autowired
    private OperatorService operatorService;

    @RequestMapping("/getOperatorInfo")
    @ResponseBody
    public String getOperatorInfo(@RequestParam(value = "uid", defaultValue = "0") int uid) {
        return operatorService.getOperatorInfo(uid).getAccount_type();
    }

    @RequestMapping("/getAllOperatorInfo")
    @ResponseBody
    public String getAllOperatorInfo() {
        List<OperatorInfo> operatorInfos = operatorService.getAllOperatorInfo();
        for (OperatorInfo operatorInfo : operatorInfos) {
            System.out.println(operatorInfo.getAccount_type());
        }
        return null;
    }

    @RequestMapping("/addOperator")
    @ResponseBody
    public String addOperator() {
        OperatorInfo operatorInfo = new OperatorInfo();
        operatorInfo.setAccount_type("x");
        operatorInfo.setOperator("x");
        operatorInfo.setOperation_type("xx");
        operatorInfo.setRelated_data("xxx");
        operatorInfo.setOperation_behavior("xxxx");
        operatorService.addOperator(operatorInfo);
        return null;
    }

    @RequestMapping("/updateOperator")
    @ResponseBody
    public String updateOperator() {
        OperatorInfo operatorInfo = new OperatorInfo();
        operatorInfo.setAccount_type("x");
        operatorInfo.setOperator("x");
        operatorInfo.setOperation_type("xx");
        operatorInfo.setRelated_data("xxx");
        operatorInfo.setOperation_behavior("xxxx");
        operatorService.updateOperator(operatorInfo);
        return null;
    }

    @RequestMapping("/deleteOperator")
    @ResponseBody
    public String deleteOperator(@RequestParam(value = "uid", defaultValue = "0") int uid) {
        operatorService.deleteOperator(uid);
        return null;
    }

    @RequestMapping(value = "/addWorkType", method = RequestMethod.POST)
    public Object addWorkType(Integer zidianType, String workName, Integer status, String color) {
        System.out.println(zidianType);
        System.out.println(workName);
        System.out.println(status);
        System.out.println(color);
        return null;
    }


}