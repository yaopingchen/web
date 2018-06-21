package com.demo.thymeleaf.service;

import com.demo.thymeleaf.service.dto.InvoiceDto;
import com.demo.thymeleaf.service.dto.InvoiceQueryDto;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class InvoiceService {
    public List<InvoiceDto> selectList(InvoiceQueryDto query){
        List<InvoiceDto> list=new ArrayList<>();
        InvoiceDto invoiceDto=new InvoiceDto();
        invoiceDto.setAmount(new BigDecimal(12345));
        invoiceDto.setCreateUserNick("张三");
        invoiceDto.setGmtCreate(new Date());
        invoiceDto.setInvoiceCode("12345");
        invoiceDto.setInvoiceNo("64234");
        invoiceDto.setRelatedNo("ATO1234");
        invoiceDto.setRemark("规划局阿克苏福利卡送福利卡发了疯拉出来了说服力kgUV镜njfslfmvslvlasvl");
        invoiceDto.setStatus("初始化");
        invoiceDto.setSourceType("导入");
        InvoiceDto invoiceDto2=new InvoiceDto();
        invoiceDto2.setAmount(new BigDecimal(12345));
        invoiceDto2.setCreateUserNick("李四");
        invoiceDto2.setGmtCreate(new Date());
        invoiceDto2.setInvoiceCode("12345");
        invoiceDto2.setInvoiceNo("64234");
        invoiceDto2.setRelatedNo("ATO1234");
        invoiceDto2.setRemark("规划局阿克苏福利卡送福利卡发了疯拉出来了说服力kgUV镜njfslfmvslvlasvl");
        invoiceDto2.setStatus("初始化");
        invoiceDto2.setSourceType("接口");
        list.add(invoiceDto);
        list.add(invoiceDto2);
        return list;
    }
}
