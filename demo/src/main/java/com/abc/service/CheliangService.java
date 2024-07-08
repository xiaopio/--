package com.abc.service;

import com.abc.bean.Cheliang;
import com.abc.mapper.CheliangMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class CheliangService {
    @Autowired
    private CheliangMapper cheliangMapper;

    public String addCheliang(Cheliang cheliang){
        return cheliangMapper.addCheliang(cheliang)==1?"添加成功":"添加失败";
    }
    public List<Cheliang> findAll(Cheliang cheliang){
        return cheliangMapper.findAll(cheliang);
    }
    public Cheliang selectOne(String id){
        return cheliangMapper.selectOne(id);
    }
    public String updateCheliang(Cheliang cheliang){
        return cheliangMapper.updateCheliang(cheliang)==1?"修改成功":"修改失败";
    }
    public String deleteCheliang(String id){
        return cheliangMapper.deleteCheliang(id)==1?"删除成功":"删除失败";
    }
    public Cheliang selectOneCheliang(String sijiid){
        return cheliangMapper.selectOneCheliang(sijiid);
    }
    public List<Map<String,Object>> findAllXcx(){
        return cheliangMapper.findAllXcx();
    }
}
