package com.imooc.homepage.dao;

import com.imooc.homepage.entity.HomepageUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author xuming
 * @Date 2019/10/31 9:19
 */
public interface HomepageUserDao extends JpaRepository<HomepageUser, Long> {
    /**
     * 通过用户名寻找数据记录
     * @param username
     * @return
     */
    HomepageUser findByUsername(String username);
}
