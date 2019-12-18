package com.wyfx.business.service;


import com.wyfx.business.entity.OperatorInfo;

import java.util.List;

public interface OperatorService {
    OperatorInfo getOperatorInfo(int uid);

    List<OperatorInfo> getAllOperatorInfo();

    int addOperator(OperatorInfo operatorInfo);

    int updateOperator(OperatorInfo operatorInfo);

    int deleteOperator(int uid);
}
