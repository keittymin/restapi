package com.api.restapi.service;

import com.api.restapi.mapper.UserMapper;
import com.api.restapi.model.CommonCode;
import com.api.restapi.model.Company;
import com.api.restapi.model.Org;
import com.api.restapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }
    @Override
    public List<Company> getAllCompany() {
        return userMapper.getAllCompany();
    }
    @Override
    public List<Org> getAllOrganization() {
        return userMapper.getAllOrganization();
    }
    @Override
    public List<CommonCode> getAllCommonCD() {
        return userMapper.getAllCommonCD();
    }
}