package com.carl.arch.web;

import com.carl.arch.service.CustomerService;
import com.carl.arch.vo.Customer;
import com.googlecode.genericdao.search.Search;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * User: carl.yu
 * Date: 15-11-4
 * Time: 下午2:30
 */
@Controller
@RequestMapping("/")
public class LoginController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/toLogin", method = RequestMethod.GET)
    public String toLogin() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam("customerId") String customerId, @RequestParam("pwd") String pwd, HttpServletResponse response, Model model) {
        if (customerId == null || customerId.trim().length() == 0) {
            model.addAttribute("error", "用户名或者密码为空");
            return "login";
        }

        List<Customer> list = customerService.search(new Search().addFilterEqual("customerId", customerId).addFilterEqual("pwd", pwd));
        if (CollectionUtils.isEmpty(list)) {
            model.addAttribute("error", "用户名或者密码错误");
            return "login";
        }

        Cookie c = new Cookie("MyLogin", list.get(0).getUuid() + "," + System.currentTimeMillis());
        response.addCookie(c);

        return "redirect:/toIndex";
    }
}
