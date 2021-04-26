package com.example.sens.config.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.example.sens.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;


/**
 * 租客接口拦截器
 *
 * @author example
 */
@Component
public class UserInterceptor extends HandlerInterceptorAdapter {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws IOException {
        User user = (User) request.getSession().getAttribute("user");
        // 如果用户未登录，拦截
        if (user == null) {
            //没有权限
            if (isAjax((HttpServletRequest) request)) {
                response.setCharacterEncoding("utf-8");
                response.setContentType("application/json; charset=utf-8");
                PrintWriter writer = response.getWriter();
                Map<String, Object> map = new HashMap<>();
                map.put("code", 0);
                map.put("msg", "用户未登录");
                writer.write(JSONObject.toJSONString(map));
            } else {
                response.sendRedirect("/login");
            }

            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {

    }

    public static boolean isAjax(HttpServletRequest httpRequest) {
        return (httpRequest.getHeader("X-Requested-With") != null
                && "XMLHttpRequest"
                .equals(httpRequest.getHeader("X-Requested-With").toString()));
    }
}

