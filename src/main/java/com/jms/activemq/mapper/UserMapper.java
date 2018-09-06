package com.jms.activemq.mapper;

import com.jms.activemq.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface UserMapper {
    @Select("select * from user where user_id = #{userId}")
    User getById(Integer userId);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into user(username,age) values(#{userName},#{age})")
    Integer save(User user);
}
