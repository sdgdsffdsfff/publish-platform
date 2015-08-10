package com.xiaomi.publish.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 应用软件
 * Created by lijie on 2015-08-10.
 */
@Controller
@RequestMapping(value = "/app")
public class AppController {

    @RequestMapping(value = "/list")
    public ModelAndView list(){

        return new ModelAndView("app_file");
    }

}
