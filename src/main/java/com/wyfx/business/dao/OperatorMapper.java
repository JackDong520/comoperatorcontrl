package com.wyfx.business.dao;


import com.wyfx.business.entity.OperatorInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OperatorMapper {
    OperatorInfo selectOperatorById(int uid);

    List<OperatorInfo> selectAllOperator();

    int addOperator(OperatorInfo key);

    int updateOperator(OperatorInfo key);

    int deleteOperator(int uid);
}
