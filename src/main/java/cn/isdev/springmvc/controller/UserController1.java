package cn.isdev.springmvc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * Created by lsh134667 on 2018/7/25.
 */
public class UserController1 extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("request.URI ==== " + httpServletRequest.getRequestURI());
        new ModelAndView();
        return new ModelAndView("hello");
    }
}
