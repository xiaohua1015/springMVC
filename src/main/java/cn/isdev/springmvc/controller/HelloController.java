package cn.isdev.springmvc.controller;

import cn.isdev.springmvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by lsh134667 on 2018/7/25.
 */
@Controller
/*@RequestMapping("/hello")*/
public class HelloController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ModelAndView test(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("request.URI ==== " + request.getRequestURI());
        new ModelAndView();
        return new ModelAndView("hello");
    }

    @RequestMapping(value = "/redirect", method = RequestMethod.GET)
    public String redirect(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("request.URI ==== " + request.getRequestURI());
        new ModelAndView();
        return "redirect:/method";
    }


    @RequestMapping(value="/method", method = RequestMethod.GET)
    @ResponseBody
    public User hello(HttpServletRequest request, HttpServletResponse response) {

//        System.out.println("name = " + name + ": age = " + age);
        System.out.println("request.URI ==== " + request.getRequestURI());
        User user = new User();
        user.setId(1);
        user.setName("小华");
        user.setPassword("qwer123456");
        return user;
    }
}
