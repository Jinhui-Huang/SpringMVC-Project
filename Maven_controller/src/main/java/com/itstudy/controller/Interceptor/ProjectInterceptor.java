package com.itstudy.controller.Interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 配置拦截器实现HandlerInterceptor接口
 * 配置拦截代码之前之后进行的代码操作
 * 声明拦截器的bean类@Component
 * */
@Component
public class ProjectInterceptor implements HandlerInterceptor {

    /**
     * 返回false可以终止原始操作的执行
     * request.getHeader("Content-Type")获取字段数据
     * handler可以拿到原始对象,对它进行反射配置
     * preHandle...application/json
     * com.itstudy.controller.BookController#save(Book)
     * com.itstudy.controller.BookController#save(Book)
     * postHandle...
     * afterCompletion...
     * */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String ContentType = request.getHeader("Content-Type");
        System.out.println("preHandle..." + ContentType);

        HandlerMethod handlerMethod = (HandlerMethod) handler;
        System.out.println(handlerMethod);
        System.out.println(handler);
        //return HandlerInterceptor.super.preHandle(request, response, handler);
        return true;
    }

    /**
     * 以下实用性不强, 实用性最高的是preHandle
     * */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle...");
        //HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion...");
        //HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
