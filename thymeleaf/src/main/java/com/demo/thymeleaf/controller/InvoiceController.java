package com.demo.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("invoice")
public class InvoiceController {
    @RequestMapping("/index")
    public String index(ModelMap model){
        model.put("list","");
        return "pages/invoice/index";
    }

}
