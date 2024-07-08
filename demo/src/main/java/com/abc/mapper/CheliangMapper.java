package com.abc.mapper;

import com.abc.bean.Cheliang;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

public interface CheliangMapper {

    //新增一个 Cheliang
    @Insert("insert into cheliang(id,mingcheng,pinpai,jiage,chepaihao,zhuangtai) values(null,#{mingcheng},#{pinpai},#{jiage},#{chepaihao},'未派')")
    int addCheliang(Cheliang cheliang);

    //查询所有的 Cheliang
    @Select("<script>" +
            "select * from cheliang" +
            "<where>" +
            "<if test='mingcheng!=null and mingcheng!=\"\"'>" +
            "and mingcheng like concat('%',#{mingcheng},'%')" +
            "</if>" +
            "<if test='pinpai!=null and pinpai!=\"\"'>" +
            "and pinpai like concat('%',#{pinpai},'%')" +
            "</if>" +
            "</where>"+
            "</script>")
    List<Cheliang> findAll(Cheliang cheliang);


    @Select("SELECT cheliang.mingcheng AS clmc,siji.mingcheng AS sjmc,cheliangpaidan.paidanshijian AS sjmc,paidanshijian AS pdsj,lianxifangshi AS zt FROM cheliangpaidan LEFT JOIN cheliang ON cheliangpaidan.cheliangid = cheliang.id LEFT JOIN siji ON cheliangpaidan.sijiid = siji.id WHERE lianxifangshi LIKE '小程序派单%'")
    List<Map<String,Object>> findAllXcx();
    //查询一个 Cheliang
    @Select("select * from cheliang where id=#{id}")
    Cheliang selectOne(String id);
    //修改一个 Cheliang
    @Update("update cheliang set pinpai=#{pinpai},jiage=#{jiage},chepaihao=#{chepaihao} where id=#{id}")
    int updateCheliang(Cheliang cheliang);
    @Update("update cheliang set zhuangtai=#{zhuangtai} where id=#{id}")
    int updateCheliangZhuangtai(Cheliang cheliang);
    //删除一个cheliang
    @Delete("delete from cheliang where id=#{id}")
    int deleteCheliang(String id);

    @Select("SELECT cheliang.* FROM cheliangpaidan LEFT JOIN cheliang ON cheliangpaidan.cheliangid = cheliang.id WHERE sijiid=#{sijiid} AND lianxifangshi='小程序派单'")
    Cheliang selectOneCheliang(String sijiid);
}
