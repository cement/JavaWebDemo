package com.cement.ysh.web;

import ch.qos.logback.ext.spring.web.LogbackConfigListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInerceptor extends HandlerInterceptorAdapter {
    Logger log = LoggerFactory.getLogger(this.getClass());
    public MyInerceptor() {
        super();
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("------------ preHandle -----------:{}",handler);
        log.info("--------------dsdsdsd-----------:{}",Thread.currentThread().getStackTrace());
        LogbackConfigListener l;
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
        log.info("------------ postHandle -----------:{}",handler);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        super.afterCompletion(request, response, handler, ex);

        log.info("------------ postHandle -----------:{}",handler);
    }

    @Override
    public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        super.afterConcurrentHandlingStarted(request, response, handler);
        log.info("------------ postHandle -----------:{}",handler);
    }
}
