package com.abc.controller;

import com.abc.bean.Siji;
import com.abc.bean.User;
import com.abc.service.SijiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/siji")
public class SijiController {

    @Autowired
    private SijiService sijiService;
    @RequestMapping("/addSiji")
    public String addSiji(Siji siji){
        return sijiService.addSiji(siji);
    }
    @RequestMapping("/zuche")
    public String zuche(String cheliangid,String sijiid){
        return sijiService.zuche(cheliangid,sijiid);
    }
    @RequestMapping("/huanche")
    public String huanche(String cheliangid,String sijiid){
        return sijiService.huanche(cheliangid,sijiid);
    }
    @RequestMapping("/updateSiji")
    public String updateSiji(Siji siji){
        return sijiService.updateSiji(siji);
    }
    @RequestMapping("/findAll")
    public List<Siji> findAll(Siji siji){
        return sijiService.findAll(siji);
    }
    @RequestMapping("/selectOne")
    public Siji selectOne(String id){
        return sijiService.selectOne(id);
    }
    @RequestMapping("/deleteSiji")
    public String deleteSiji(String id){
        return sijiService.deleteSiji(id);
    }
    @RequestMapping("/login")
    public String login(Siji siji){
        return sijiService.login(siji);
    }



}
