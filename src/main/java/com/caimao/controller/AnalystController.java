package com.caimao.controller;

import com.caimao.entity.AnalystEntity;
import com.caimao.service.AnalystService;
import com.google.gson.Gson;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


/**
 * Created by HuoBi on 2016/4/29.
 */
@Controller
@RequestMapping("/analyset")
public class AnalystController {

    @Resource
    private AnalystService analystService;

    private org.slf4j.Logger logger = LoggerFactory.getLogger(AnalystController.class);

    @RequestMapping(value = "/info", method = RequestMethod.GET,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String first(final HttpServletResponse response, final HttpServletRequest request) throws Exception {
        List<AnalystEntity> analystEntities = analystService.queryAnalystlist();
        logger.info(new Gson().toJson(analystEntities) == null ? "" : new Gson().toJson(analystEntities));
        response.setCharacterEncoding("UTF-8");
        return new Gson().toJson(analystEntities) == null ? "" : new Gson().toJson(analystEntities);
    }

    @RequestMapping(value = "/html", method = RequestMethod.GET)
    public ModelAndView firstHtml(final HttpServletResponse response, final HttpServletRequest request) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/html/demo");
        return modelAndView;
    }
}
