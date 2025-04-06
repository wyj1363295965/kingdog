package com.wyj.kingdog.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Component
@Slf4j
public class AuthInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("authorization");
        String requestURI = request.getRequestURI();
        log.info("进入拦截器,地址:{}",requestURI);

        if (StringUtils.isEmpty(token)) {
            log.info("用户未登录");
            throw new RuntimeException("用户未登录");
        }
        //UserUtil.setLoginUser(new User().setUsername(token));
        return true;
    }


    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        //String mobileToken = request.getHeader(SecurityConstants.TOKEN_HEADER);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
                                Exception ex) throws Exception {
        // do nothing
    }

}
