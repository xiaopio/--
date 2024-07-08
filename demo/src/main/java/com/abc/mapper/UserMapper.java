package com.abc.mapper;

import com.abc.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    //新增一个 User
    @Insert("insert into usera(id,name,pass) values(null,#{name},#{pass})")
    int addUser(User user);
    //根据name查询User
    @Select("select * from usera where name=#{name}")
    User findUserByName(String name);

}
