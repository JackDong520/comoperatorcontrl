package com.wyfx.business;

import com.wyfx.business.entity.OperatorInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {
    public static void main(String[] args) {
        try {
            // 读取配置文件 mybatis-config.xml
            InputStream config = Resources
                    .getResourceAsStream("mybatis-config.xml");
            // 根据配置文件构建SqlSessionFactory
            SqlSessionFactory ssf = new SqlSessionFactoryBuilder()
                    .build(config);
            // 通过 SqlSessionFactory 创建 SqlSession
            SqlSession ss = ssf.openSession();
            // SqlSession执行映射文件中定义的SQL，并返回映射结果
            /*
             * com.mybatis.mapper.UserMapper.selectOperatorById 为 UserMapper.xml
             * 中的命名空间+select 的 id
             */
            // 查询一个用户
            OperatorInfo mu = ss.selectOne(
                    "com.jack.dao.OperatorMapper.selectOperatorById", 1);
            System.out.println(mu);

            // 添加一个用户
            OperatorInfo addmu = new OperatorInfo();
            addmu.setAccount_type("123");
            addmu.setOperation_behavior("123");
            addmu.setOperation_type("123");
            addmu.setOperator("123");
            addmu.setRelated_data("123");
            addmu.setUid(2);


            ss.insert("com.jack.dao.OperatorMapper.addUser", addmu);
//            // 修改一个用户
//            OperatorInfo updatemu = new OperatorInfo();
//
//            ss.update("com.mybatis.mapper.UserMapper.updateUser", updatemu);
//            // 删除一个用户
//            ss.delete("com.mybatis.mapper.UserMapper.deleteUser", 3);
//            // 查询所有用户
            List<OperatorInfo> listMu = ss
                    .selectList("com.jack.dao.OperatorMapper.selectAllUser");
            for (OperatorInfo myUser : listMu) {
                System.out.println(myUser.getRelated_data());
            }
            // 提交事务
            ss.commit();
            // 关闭 SqlSession
            ss.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}