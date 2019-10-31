package com.imooc.homepage.controller;

import com.alibaba.fastjson.JSON;
import com.imooc.homepage.CourseInfo;
import com.imooc.homepage.CourseInfosRequest;
import com.imooc.homepage.service.ICourseService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuming
 * @Date 2019/10/30 20:49
 */
@Slf4j
@RestController
public class HomepageController {

    @Autowired
    private ICourseService courseService;

    /**
     * 不通过网关 : 127.0.0.1:7001/homepage-course/get/course?id=
     * 通过网关 : 127.0.0.1:9000/imooc/homepage-course/get/course?id=
     * */
    @GetMapping("/get/course")
    public CourseInfo getCourseInfo(Long id) {
        log.info("<homepage-course>: get course -> {}", id);
        return courseService.getCourseInfo(id);
    }

    @PostMapping("/get/courses")
    public List<CourseInfo> getCourseInfos(
        @RequestBody CourseInfosRequest request) {
        log.info("<homepage-course>: get courses -> {}",
            JSON.toJSONString(request));
        return courseService.getCourseInfos(request);
    }
}
