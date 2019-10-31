package com.imooc.homepage.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

/**
 * @author xuming
 * @Date 2019/10/30 19:43
 */
@Slf4j
@Component
public class AccessLogFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
    }

    @Override
    public int filterOrder() {
        // 数值越小,优先级越高
        // 该过滤器在服务器返回响应之前起作用,所以这里是对应的值减1,值小则优先级高
        return FilterConstants.SEND_RESPONSE_FILTER_ORDER - 1;
    }

    @Override
    public boolean shouldFilter() {
        // 该过滤器是否其作用,true为是
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        // 拿到上下文对象
        RequestContext ctx = RequestContext.getCurrentContext();
        // 取出开始时间戳
        Long startTime = (Long) ctx.get("startTime");

        HttpServletRequest request = ctx.getRequest();
        String uri = request.getRequestURI();

        Long duration = System.currentTimeMillis() - startTime;

        log.info("uri:{}, duration:{}ms", uri, duration / 100);

        return null;
    }
}
