package com.imooc.homepage.service;

import com.imooc.homepage.UserInfo;
import com.imooc.homepage.vo.CreateUserRequest;
import com.imooc.homepage.vo.UserCourseInfo;

/**
 * 用户相关服务接口定义
 * @author xuming
 * @Date 2019/10/31 12:44
 */
public interface IUserService {
    /** 创建用户 */
    UserInfo createUser(CreateUserRequest request);

    /** 根据id获取用户信息 */
    UserInfo getUserInfo(Long id);

    /** 获取用户和课程信息 */
    UserCourseInfo getUserCourseInfo(Long id);

}
