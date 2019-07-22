package com.cn;

import com.cn.mapper.UserMapper;
import com.cn.pojo.UserWithDetail;
import com.cn.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author Syen
 * @date 2019/7/22 0022-上午 1:56
 */
public class Test1 {
@Test
    public void m1(){
    SqlSession sqlSession=MybatisUtil.getSession();
    UserMapper userMapper=sqlSession.getMapper(UserMapper.class);

    UserWithDetail userWithDetail=userMapper.queryByut_Id(1);

    System.out.println(userWithDetail);

    sqlSession.close();
}
    @Test
    public void Step(){
        SqlSession sqlSession=MybatisUtil.getSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);

        UserWithDetail userWithDetail=userMapper.queryByStep(1);

        System.out.println(userWithDetail);

        sqlSession.close();
    }
}
