package cn.isdev.springmvc.controller;

import cn.isdev.springmvc.bean.User;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2018/7/27.
 */
@Controller
public class UserController {

    @InitBinder
    protected  void initBinder(HttpServletRequest request, ServletRequestDataBinder binder){
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
    }
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(User user){
        System.out.println("user = " + user);
        return "hello";
    }

    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }
}
