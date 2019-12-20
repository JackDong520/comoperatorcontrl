package com.wyfx.business.service;


import com.wyfx.business.entity.OperatorInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface OperatorService {
    List<OperatorInfo> getOperatorInfo(int uid);

    List<OperatorInfo> getAllOperatorInfo();

    int addOperator(OperatorInfo operatorInfo);

    int updateOperator(OperatorInfo operatorInfo);

    int deleteOperator(int uid);

    List<OperatorInfo> selectOperatorByName(String key);

    List<OperatorInfo> selectOperatorByPage(Map<String,Object> data);

    List<OperatorInfo> selectOperatorNyDate(Map<String,Object> data);
}
