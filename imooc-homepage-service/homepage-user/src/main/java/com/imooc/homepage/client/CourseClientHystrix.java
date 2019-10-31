package com.imooc.homepage.client;

import com.imooc.homepage.CourseInfo;
import com.imooc.homepage.CourseInfosRequest;
import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * 熔断降级策略
 * @author xuming
 * @Date 2019/10/31 12:37
 */
@Component
public class CourseClientHystrix implements CourseClient{
    @Override
    public CourseInfo getCourseInfo(Long id) {
        return CourseInfo.invalid();
    }

    @Override
    public List<CourseInfo> getCourseInfos(CourseInfosRequest request) {
        return Collections.emptyList();
    }
}
