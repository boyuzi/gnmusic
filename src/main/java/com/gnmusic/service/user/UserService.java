package com.gnmusic.service.user;

import com.gnmusic.model.UserDomain;

import java.util.List;

/**
 * @author chenjinbo
 * @create 2018-05-16 16:23
 */
public interface UserService
{
    int addUser(UserDomain user);

    List<UserDomain> findAllUser(int pageNum, int pageSize);
}
