package com.caimao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by HuoBi on 2016/4/29.
 */
@Controller
@RequestMapping("/demo")
public class HelloController {

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    @ResponseBody
    public String first(final HttpServletResponse response, final HttpServletRequest request) throws Exception {
        return "this is a string";
    }

    @RequestMapping(value = "/jsp", method = RequestMethod.GET)
    public ModelAndView firstJsp(final HttpServletResponse response, final HttpServletRequest request) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/html/index");
        return modelAndView;
    }

    @RequestMapping(value = "/html", method = RequestMethod.GET)
    public ModelAndView firstHtml(final HttpServletResponse response, final HttpServletRequest request) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/html/demo");
        return modelAndView;
    }
}
