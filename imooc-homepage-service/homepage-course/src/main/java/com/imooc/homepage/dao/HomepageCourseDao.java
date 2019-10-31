package com.imooc.homepage.dao;

import com.imooc.homepage.entity.HomepageCourse;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author xuming
 * @Date 2019/10/30 20:37
 */
public interface HomepageCourseDao extends JpaRepository<HomepageCourse, Long> {
}
