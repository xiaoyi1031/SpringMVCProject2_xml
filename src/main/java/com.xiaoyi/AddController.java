package com.xiaoyi;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.xiaoyi.service.AddService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j, HttpServletRequest request, HttpServletResponse response) {


        //int i = Integer.parseInt(request.getParameter("t1"));
        //int j = Integer.parseInt(request.getParameter("t2"));

        AddService as = new AddService();
        int k = as.add(i,j);

        //Using ModelAndView object to send value to jsp file

        ModelAndView mv = new ModelAndView();
        mv.setViewName("display.jsp");
        mv.addObject("result", k);

        return mv;
    }
}
