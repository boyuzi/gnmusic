package com.gnmusic.dao;

import com.gnmusic.model.UserDomain;

import java.util.List;

/**
 * @author chenjinbo
 * @create 2018-05-16 16:18
 */
public interface UserDao
{
    int insert(UserDomain record);

    List<UserDomain> selectUsers();
}
