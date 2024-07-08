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


@Service
public class SijiService {
    @Autowired
    private SijiMapper sijiMapper;

    public String addSiji(Siji siji){
        Siji siji1 = sijiMapper.selectOneZhanghao(siji.getZhanghao());
        if(siji1!=null){
            return "账号已存在,新增失败";
        }
        return sijiMapper.addSiji(siji)==1?"添加成功":"添加失败";
    }
    public String login(Siji siji){
        Siji siji1 = sijiMapper.selectOneZhanghao(siji.getZhanghao());
        if(siji1!=null && siji1.getMima().equals(siji.getMima())){
            return "登录成功="+siji1.getMingcheng()+"="+siji1.getId();
        }
        return "登录失败,用户或密码错误";
    }
    public List<Siji> findAll(Siji siji){
        return sijiMapper.findAll(siji);
    }
    public Siji selectOne(String id){
        return sijiMapper.selectOne(id);
    }
    public String updateSiji(Siji siji){
        return sijiMapper.updateSiji(siji)==1?"修改成功":"修改失败";
    }
    public String deleteSiji(String id){
        return sijiMapper.deleteSiji(id)==1?"删除成功":"删除失败";
    }
    @Autowired
    private CheliangMapper cheliangMapper;
    @Autowired
    private PaidanMapper paidanMapper;


    public String zuche(String cheliangid,String sijiid){
        //查询车辆状态
        if(sijiMapper.selectOne(sijiid).getSijizhuangtai().equals("工作")){
            return "该司机工作中";
        }
        //检查车辆状态
        if(cheliangMapper.selectOne(cheliangid).getZhuangtai().equals("已派")){
            return "该车辆已派单";
        }
        //修改司机状态
        sijiMapper.updateSijiZhuangtai(new Siji(Integer.valueOf(sijiid),"工作"));
        //修改车辆状态
        cheliangMapper.updateCheliangZhuangtai(new Cheliang(Integer.valueOf(cheliangid),"已派"));

        Cheliangpaidan cheliangpaidan = new Cheliangpaidan();
        cheliangpaidan.setCheliangid(cheliangid);
        cheliangpaidan.setSijiid(sijiid);
        cheliangpaidan.setLianxifangshi("小程序派单");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        cheliangpaidan.setPaidanshijian(sdf.format(System.currentTimeMillis()));
        paidanMapper.addPaidan(cheliangpaidan);
        return "租赁成功";
    }
    public String huanche(String cheliangid,String sijiid){
        //修改司机状态
        sijiMapper.updateSijiZhuangtai(new Siji(Integer.valueOf(sijiid),"休息"));
        //修改车辆状态
        cheliangMapper.updateCheliangZhuangtai(new Cheliang(Integer.valueOf(cheliangid),"正常"));
        paidanMapper.upd(cheliangid,sijiid);
        return "还车成功";
    }
}
