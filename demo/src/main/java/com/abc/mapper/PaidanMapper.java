package com.abc.mapper;

import com.abc.bean.Cheliangpaidan;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

public interface PaidanMapper {


    //查询所有
    @Select("SELECT clpd.id as id,cl.mingcheng clmc,sj.mingcheng AS sjmc,paidanshijian AS pdsj,lianxifangshi AS lxfs FROM cheliangpaidan AS clpd LEFT JOIN cheliang AS cl ON clpd.cheliangid = cl.id LEFT JOIN siji AS sj ON clpd.sijiid = sj.id")
    List<Map<String,Object>> findAll();
    //查询所有
    @Select("SELECT clpd.id as id,cl.mingcheng clmc,sj.mingcheng AS sjmc,paidanshijian AS pdsj,lianxifangshi AS lxfs FROM cheliangpaidan AS clpd LEFT JOIN cheliang AS cl ON clpd.cheliangid = cl.id LEFT JOIN siji AS sj ON clpd.sijiid = sj.id where clpd.id=#{id}")
    Map<String,Object> selectOne(String id);
    //新增一条记录
    @Insert("insert into cheliangpaidan(id,cheliangid,sijiid,paidanshijian,lianxifangshi) values(null,#{cheliangid},#{sijiid},#{paidanshijian},#{lianxifangshi})")
    int addPaidan(Cheliangpaidan cheliangpaidan);
    //删除
    @Update("delete from cheliangpaidan where id=#{id}")
    int deleteCheliangpaidan(String id);
    //修改
    @Update("update cheliangpaidan set lianxifangshi=#{lianxifangshi} where id=#{id}")
    int updateCheliangpaidan(Cheliangpaidan cheliangpaidan); //修改
    @Update("update cheliangpaidan set lianxifangshi='小程序派单-归还' where cheliangid=#{cheliangid} and sijiid=${sijiid}")
    int upd(String cheliangid,String sijiid);
}
