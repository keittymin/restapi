package com.api.restapi.mapper;

import com.api.restapi.model.CommonCode;
import com.api.restapi.model.Company;
import com.api.restapi.model.Org;
import com.api.restapi.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> getAllUsers();
    List<Company> getAllCompany();
    List<Org>  getAllOrganization();
    List<CommonCode>  getAllCommonCD();
}