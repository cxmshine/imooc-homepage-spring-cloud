package com.imooc.homepage.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * homepage_course 映射实体表定义
 * @author xuming
 * @Date 2019/10/30 20:29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "homepage_course")
public class HomepageCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /** 课程名称 */
    @Column(name = "course_name", nullable = false)
    private String courseName;

    /** 课程类型: 0(免费课), 1(实战课) */
    @Column(name = "course_type", nullable = false)
    private Integer courseType;

    /** 课程图标 */
    @Column(name = "course_icon", nullable = false)
    private String courseIcon;

    /** 课程介绍 */
    @Column(name = "course_intro", nullable = false)
    private String courseIntro;

    /** 创建时间 */
    @Column(name = "create_time", nullable = false)
    @CreatedDate
    private Date createTime;

    @Column(name = "update_time", nullable = false)
    @LastModifiedDate
    private Date updateTime;

    public HomepageCourse(String courseName, Integer courseType,
        String courseIcon, String courseIntro) {
        this.courseName = courseName;
        this.courseType = courseType;
        this.courseIcon = courseIcon;
        this.courseIntro = courseIntro;
    }

    /**
     * @return 一个无效的课程
     */
    public static HomepageCourse invalid() {
        HomepageCourse invalid = new HomepageCourse(
            "", 0, "", ""
        );
        invalid.setId(-1L);
        return invalid;
    }

}
