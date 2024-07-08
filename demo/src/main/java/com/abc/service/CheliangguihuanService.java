package com.abc.service;

import com.abc.bean.Cheliang;
import com.abc.bean.Cheliangguihuan;
import com.abc.mapper.CheliangMapper;
import com.abc.mapper.CheliangguihuanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class CheliangguihuanService {
    @Autowired
    private CheliangguihuanMapper cheliangguihuanMapper;
    @Autowired
    private CheliangMapper cheliangMapper;
    public String addCheliangguihuan(Cheliangguihuan cheliangguihuan){
        Cheliang cheliang = new Cheliang();
        cheliang.setZhuangtai("未派");
        cheliang.setId(Integer.parseInt(cheliangguihuan.getChelinagid()));
        cheliangMapper.updateCheliangZhuangtai(cheliang);
        //设置车辆的状态
        return cheliangguihuanMapper.addCheliangguihuan(cheliangguihuan)==1?"归还成功":"归还失败";
    }
    public List<Map<String,Object>> findAll(Cheliangguihuan cheliangguihuan) {
        return cheliangguihuanMapper.findAll(cheliangguihuan);
    }
    public String deleteCheliangguihuan(String id){
        return cheliangguihuanMapper.deleteCheliangguihuan(id)==1?"删除成功":"删除失败";
    }
    public Map<String,Object> selectOne(String id){
        return cheliangguihuanMapper.selectOne(id);
    }
    public String updateCheliangguihuan(Cheliangguihuan cheliangguihuan){
        return cheliangguihuanMapper.updateCheliangguihuan(cheliangguihuan)==1?"修改成功":"修改失败";
    }
}
