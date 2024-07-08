package com.abc.controller;

import com.abc.bean.Cheliang;
import com.abc.service.CheliangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/cheliang")
public class CheliangController {

    @Autowired
    private CheliangService cheliangService;
    @RequestMapping("/addCheliang")
    public String addCheliang(Cheliang cheliang){
        return cheliangService.addCheliang(cheliang);
    }
    @RequestMapping("/updateCheliang")
    public String updateCheliang(Cheliang cheliang){
        return cheliangService.updateCheliang(cheliang);
    }
    @RequestMapping("/findAll")
    public List<Cheliang> findAll(Cheliang cheliang){
        return cheliangService.findAll(cheliang);
    }
    @RequestMapping("/selectOne")
    public Cheliang selectOne(String id){
        return cheliangService.selectOne(id);
    }
    @RequestMapping("/deleteCheliang")
    public String deleteCheliang(String id){
        return cheliangService.deleteCheliang(id);
    }
    @RequestMapping("/selectOneCheliang")
    public Cheliang selectOneCheliang(String sijiid){
        System.out.println(sijiid);
        return cheliangService.selectOneCheliang(sijiid);
    }
    @RequestMapping("/findAllXcx")
    public List<Map<String,Object>> findAllXcx(){
        return cheliangService.findAllXcx();
    }



}
