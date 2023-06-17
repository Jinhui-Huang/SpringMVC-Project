package com.itstudy.controller;

import com.itstudy.exception.BusinessException;
import com.itstudy.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 项目异常处理器
 * 声明这个类是做异常处理的@RestControllerAdvice
 * 编写方法来处理异常
 */
@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException ex) {
        /**
         * 记录日志
         * 发送消息给开发人员
         * 发送邮件给开发人员
         * */
        System.out.println("出现系统异常");
        ex.printStackTrace();
        return new Result(ex.getCode(), null, ex.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException ex) {
        System.out.println("出现业务异常");
        ex.printStackTrace();
        return new Result(ex.getCode(), null, ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public Result doBusinessException(Exception ex) {
        /**
         * 记录日志
         * 发送消息给开发人员
         * 发送邮件给开发人员
         * */
        System.out.println("出现未知异常");
        ex.printStackTrace();
        return new Result(Code.SYSTEM_UNKNOWN_ERR, false, "系统繁忙,请稍后再试!");
    }

}
