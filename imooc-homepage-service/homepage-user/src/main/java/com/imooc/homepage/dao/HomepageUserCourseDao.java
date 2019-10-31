package com.imooc.homepage.dao;

import com.imooc.homepage.entity.HomepageUser;
import com.imooc.homepage.entity.HomepageUserCourse;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author xuming
 * @Date 2019/10/31 9:20
 */
public interface HomepageUserCourseDao extends JpaRepository<HomepageUserCourse, Long> {

    /**
     * 通过用户 id 寻找数据记录
     * @param userId
     * @return
     */
    List<HomepageUserCourse> findAllByUserId(Long userId);
}
