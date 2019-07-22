package com.cn.mapper;

import com.cn.pojo.UserDetail;
import org.apache.ibatis.annotations.Param;

/**
 * @author Syen
 * @date 2019/7/22 0022-上午 11:51
 */
public interface UserDetailMapper {
    UserDetail queryByUserId(@Param("id") Integer id);
}
