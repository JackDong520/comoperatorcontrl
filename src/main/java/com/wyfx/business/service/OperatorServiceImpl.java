package com.wyfx.business.service;

import com.wyfx.business.dao.OperatorMapper;
import com.wyfx.business.entity.OperatorInfo;
import com.wyfx.business.service.OperatorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class OperatorServiceImpl implements OperatorService {

    @Autowired
    private OperatorMapper operatorMapper;

    @Override
    public List<OperatorInfo> getOperatorInfo(int uid) {
        List<OperatorInfo> list = new ArrayList<>();
        list.add(operatorMapper.selectOperatorById(uid));
        return list;
    }

    @Override
    public List<OperatorInfo> getAllOperatorInfo() {
        return operatorMapper.selectAllOperator();
    }

    @Override
    public int addOperator(OperatorInfo operatorInfo) {
        return operatorMapper.addOperator(operatorInfo);
    }

    @Override
    public int updateOperator(OperatorInfo operatorInfo) {
        return operatorMapper.updateOperator(operatorInfo);
    }

    @Override
    public int deleteOperator(int uid) {
        return operatorMapper.deleteOperator(uid);
    }

    @Override
    public List<OperatorInfo> selectOperatorByName(String key) {
        return operatorMapper.selectOperatorByName(key);
    }

    @Override
    public List<OperatorInfo> selectOperatorByPage(Map<String, Object> data) {
        return operatorMapper.selectOperatorByPage(data);
    }

    @Override
    public List<OperatorInfo> selectOperatorNyDate(Map<String, Object> data) {
        return operatorMapper.selectOperatorNyDate(data);
    }


    @Test
    void test() {
        OperatorServiceImpl operatorService = new OperatorServiceImpl();
        OperatorInfo operatorInfo = new OperatorInfo();
        operatorInfo.setRelated_data("xx");
        operatorInfo.setOperation_type("xx");
        operatorInfo.setOperator("xx");
        operatorInfo.setAccount_type("xx");
        operatorService.addOperator(operatorInfo);
    }
}
