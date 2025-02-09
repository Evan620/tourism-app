package com.example.tourismsystem.mapper;

import com.example.tourismsystem.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> getAllUsers();
    User getUserById(Integer id);
    void insertUser(User user);
    void updateUser(User user);
    void deleteUser(Integer id);
}