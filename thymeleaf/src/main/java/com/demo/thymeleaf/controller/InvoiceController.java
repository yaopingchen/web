package com.demo.thymeleaf.controller;

import com.demo.thymeleaf.service.InvoiceService;
import com.demo.thymeleaf.service.dto.InvoiceQueryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("invoice")
public class InvoiceController {
    @Autowired
    private InvoiceService invoiceService;
    @RequestMapping("/index")
    public String index(ModelMap model){
        InvoiceQueryDto query=new InvoiceQueryDto();
        model.put("list",invoiceService.selectList(query));
        return "pages/invoice/index";
    }

}
