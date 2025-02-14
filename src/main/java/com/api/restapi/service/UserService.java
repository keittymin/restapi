package com.api.restapi.service;

import com.api.restapi.model.CommonCode;
import com.api.restapi.model.Company;
import com.api.restapi.model.Org;
import com.api.restapi.model.User;

import java.util.List;

public interface UserService
{
    List<User> getAllUsers();

    List<Company> getAllCompany();

    List<Org> getAllOrganization();

    List<CommonCode> getAllCommonCD();
}