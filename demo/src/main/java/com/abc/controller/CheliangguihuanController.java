package com.abc.controller;

import com.abc.bean.Cheliang;
import com.abc.bean.Cheliangguihuan;
import com.abc.service.CheliangService;
import com.abc.service.CheliangguihuanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/cheliangguihuan")
public class CheliangguihuanController {

    @Autowired
    private CheliangguihuanService chimpanguihuanService;
    @RequestMapping("/addCheliangguihuan")
    public String addCheliangguihuan(Cheliangguihuan cheliangguihuan){
        return chimpanguihuanService.addCheliangguihuan(cheliangguihuan);
    }

    @RequestMapping("/findAll")
    public List<Map<String,Object>> findAll(Cheliangguihuan cheliangguihuan){
        return chimpanguihuanService.findAll(cheliangguihuan);
    }
    @RequestMapping("/deleteCheliangguihuan")
    public String deleteCheliangguihuan(String id){
        return chimpanguihuanService.deleteCheliangguihuan(id);
    }
    @RequestMapping("/selectOne")
    public Map<String,Object> selectOne(String id){
        return chimpanguihuanService.selectOne(id);
    }
    @RequestMapping("/updateCheliangguihuan")
    public String updateCheliangguihuan(Cheliangguihuan cheliangguihuan){
        return chimpanguihuanService.updateCheliangguihuan(cheliangguihuan);
    }


}
