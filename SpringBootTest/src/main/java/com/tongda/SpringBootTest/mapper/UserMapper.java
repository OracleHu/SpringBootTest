package com.tongda.SpringBootTest.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.tongda.SpringBootTest.entity.UserInfo;

@Mapper
public interface UserMapper {
  @Select("select * from user_info where id = #{id}")
  UserInfo findById(@Param("id") int id);
}
