package com.abc.controller;

import com.abc.bean.Cheliangpaidan;
import com.abc.service.PaidanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/paidan")
public class PaidanController {

    @Autowired
    private PaidanService paidanService;
    @RequestMapping("/findAll")
    public List<Map<String,Object>> findAll(){
        return paidanService.findAll();
    }
    @RequestMapping("/addPaidan")
    public String addPaidan(Cheliangpaidan cheliangpaidan){
        return paidanService.addPaidan(cheliangpaidan);
    }
    @RequestMapping("/deleteCheliangpaidan")
    public String deleteCheliangpaidan(String id){
        return paidanService.deleteCheliangpaidan(id);
    }
    @RequestMapping("/selectOne")
    public Map<String,Object> selectOne(String id){
        return paidanService.selectOne(id);
    }
    @RequestMapping("/updateCheliangpaidan")
    public String updateCheliangpaidan(Cheliangpaidan cheliangpaidan){
        return paidanService.updateCheliangpaidan(cheliangpaidan);
    }

}
