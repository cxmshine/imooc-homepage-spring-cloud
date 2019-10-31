package com.imooc.homepage;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 课程信息请求对象定义
 * @author xuming
 * @Date 2019/10/30 20:11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseInfosRequest {
    private List<Long> ids;
}
