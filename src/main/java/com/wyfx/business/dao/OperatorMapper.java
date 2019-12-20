package com.wyfx.business.dao;


import com.wyfx.business.entity.OperatorInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface OperatorMapper {
    OperatorInfo selectOperatorById(int uid);

    List<OperatorInfo> selectAllOperator();

    int addOperator(OperatorInfo key);

    int updateOperator(OperatorInfo key);

    int deleteOperator(int uid);

    List<OperatorInfo> selectOperatorByName(String key);

    List<OperatorInfo> selectOperatorByPage(Map<String, Object> data);

    List<OperatorInfo> selectOperatorNyDate(Map<String, Object> data);

    List<OperatorInfo> selectOperatorByAllKey(Map<String, Object> data);
}
