package com.abc.service;

import com.abc.bean.Cheliang;
import com.abc.bean.Cheliangpaidan;
import com.abc.bean.Siji;
import com.abc.mapper.CheliangMapper;
import com.abc.mapper.PaidanMapper;
import com.abc.mapper.SijiMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;


@Service
public class PaidanService {
    @Autowired
    private PaidanMapper paidanMapper;
    @Autowired
    private CheliangMapper cheliangMapper;
    @Autowired
    private SijiMapper sijiMapper;

    public List<Map<String,Object>> findAll(){
        return paidanMapper.findAll();
    }
    public String addPaidan(Cheliangpaidan cheliangpaidan){
        //检查司机状态
        if(sijiMapper.selectOne(cheliangpaidan.getSijiid()).getSijizhuangtai().equals("工作")){
            return "该司机工作中";
        }
        //检查车辆状态
        if(cheliangMapper.selectOne(cheliangpaidan.getCheliangid()).getZhuangtai().equals("已派")){
            return "该车辆已派单";
        }
        //修改司机状态
        sijiMapper.updateSijiZhuangtai(new Siji(Integer.valueOf(cheliangpaidan.getSijiid()),"工作"));
        //修改车辆状态
        cheliangMapper.updateCheliangZhuangtai(new Cheliang(Integer.valueOf(cheliangpaidan.getCheliangid()),"已派"));
        //新增派单记录
        //获取系统当前时间年月日时分秒
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        cheliangpaidan.setPaidanshijian(sdf.format(System.currentTimeMillis()));
        paidanMapper.addPaidan(cheliangpaidan);
        return "派单成功";
    }
    public String deleteCheliangpaidan(String id){
        return paidanMapper.deleteCheliangpaidan(id)==1?"删除成功":"删除失败";
    }
    public Map<String,Object> selectOne(String id){
        return paidanMapper.selectOne(id);
    }
    public String updateCheliangpaidan(Cheliangpaidan cheliangpaidan){
        return paidanMapper.updateCheliangpaidan(cheliangpaidan)==1?"修改成功":"修改失败";
    }
}
