package com.abc.mapper;

import com.abc.bean.Cheliang;
import com.abc.bean.Siji;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SijiMapper {

    //新增一个 Siji
    @Insert("insert into siji(id,mingcheng,jialing,jiazhaodengji,sijizhuangtai,zhanghao,mima) values(null,#{mingcheng},#{jialing},#{jiazhaodengji},'休息',#{zhanghao},#{mima})")
    int addSiji(Siji siji);

    //查询所有的 Siji
    @Select("<script>" +
            "select * from siji" +
            "<where>" +
            "<if test='mingcheng!=null and mingcheng!=\"\"'>" +
            "and mingcheng like concat('%',#{mingcheng},'%')" +
            "</if>" +
            "</where>"+
            "</script>")
    List<Siji> findAll(Siji siji);
    //查询一个 Siji
    @Select("select * from siji where id=#{id}")
    Siji selectOne(String id);
    //查询一个 Siji
    @Select("select * from siji where zhanghao=#{zhanghao}")
    Siji selectOneZhanghao(String zhanghao);
    //修改一个 Siji
    @Update("update siji set jialing=#{jialing},jiazhaodengji=#{jiazhaodengji},mima=#{mima} where id=#{id}")
    int updateSiji(Siji siji);
    @Update("update siji set sijizhuangtai=#{sijizhuangtai} where id=#{id}")
    int updateSijiZhuangtai(Siji siji);
    //删除一个 Siji
    @Update("delete from siji where id=#{id}")
    int deleteSiji(String id);
}
