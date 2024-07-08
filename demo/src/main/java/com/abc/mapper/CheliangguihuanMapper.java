package com.abc.mapper;

import com.abc.bean.Cheliangguihuan;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;


public interface CheliangguihuanMapper {

    //新增一个 cheliangguihuan
    @Insert("insert into cheliangguihuan values(null,#{chelinagid},#{luxian},'正常',#{kaishishijian},#{guihuanshijian})")
    int addCheliangguihuan(Cheliangguihuan cheliangguihuan);
    @Select("<script>" +
            "SELECT cheliangguihuan.*,cheliang.mingcheng FROM cheliangguihuan LEFT JOIN cheliang ON cheliangguihuan.chelinagid = cheliang.id" +
            "<where>" +
            "<if test='luxian!=null and luxian!=\"\"'>" +
            "and luxian like concat('%',#{luxian},'%')" +
            "</if>" +
            "</where>"+
            "</script>")
    List<Map<String,Object>> findAll(Cheliangguihuan cheliangguihuan);
    @Delete("delete from cheliangguihuan where id=#{id}")
    int deleteCheliangguihuan(String id);
    @Select("SELECT cheliangguihuan.*,cheliang.mingcheng as clmc FROM cheliangguihuan LEFT JOIN cheliang ON cheliangguihuan.chelinagid = cheliang.id where cheliangguihuan.id=#{id}")
    Map<String,Object> selectOne(String id);
    @Update("update cheliangguihuan set luxian=#{luxian},kaishishijian=#{kaishishijian},guihuanshijian=#{guihuanshijian} where id=#{id}")
    int updateCheliangguihuan(Cheliangguihuan cheliangguihuan);
}
