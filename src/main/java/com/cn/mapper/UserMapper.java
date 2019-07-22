package com.cn.mapper;

import com.cn.pojo.UserWithDetail;
import org.apache.ibatis.annotations.Param;

/**
 * @author Syen
 * @date 2019/7/22 0022-上午 1:36
 */
public interface UserMapper {
    UserWithDetail queryByut_Id(@Param("id") Integer id);

    UserWithDetail queryByStep(@Param("id") Integer id);
}
