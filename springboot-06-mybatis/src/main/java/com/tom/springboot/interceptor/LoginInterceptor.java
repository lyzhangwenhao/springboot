package com.tom.springboot.interceptor;

import org.springframework.cglib.transform.impl.InterceptFieldFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * ClassName: LoginInterceptor
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/16 19:59
 */
@Component("l")
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("1-------------------------");
        HttpSession session = request.getSession();
        String s = request.getRequestURI();
        System.out.println(s);
        Object loginUser = session.getAttribute("loginUser");
        if(loginUser==null) {
            System.out.println("拦截----------------------------------");
            request.setAttribute("msg","请先登录");
            request.getRequestDispatcher("/login").forward(request,response);
            return false;
        }else {
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
