package com.carl.arch.web;

import com.carl.arch.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * User: carl.yu
 * Date: 15-11-4
 * Time: 下午3:22
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value = "/toIndex", method = RequestMethod.GET)
    public String toIndex(Model model) {
        

        return "index";
    }
}
