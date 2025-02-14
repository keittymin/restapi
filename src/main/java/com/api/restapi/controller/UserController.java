package com.api.restapi.controller;

import com.api.restapi.model.CommonCode;
import com.api.restapi.model.Company;
import com.api.restapi.model.Org;
import com.api.restapi.model.User;
import com.api.restapi.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Constraint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Contract;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/data")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/userList")
    public Map<String, Object> getAllUsers(HttpServletRequest request) {
        Map<String, Object> retval = new HashMap<>();
        List<User> user = userService.getAllUsers();
        String tokenx = request.getHeader("token");
        System.out.println("========================== Token ====" + tokenx);
        String requestUrl = request.getRequestURL().toString();
        retval.put("requestUrl", requestUrl);
        retval.put("errorCode", 0);
        retval.put("errorMessage", "");
        retval.put("data", user);
        return retval;
    }

    @RequestMapping("/companyList")
    public Map<String, Object> getAllCompany(HttpServletRequest request) {
        Map<String, Object> retval = new HashMap<>();
        List<Company> company = userService.getAllCompany();
        String token = request.getHeader("token").toString();
        System.out.println("========================== Token ====" + token);
        String requestUrl = request.getRequestURL().toString();
        retval.put("requestUrl", requestUrl);
        retval.put("errorCode", 0);
        retval.put("errorMessage", "");
        retval.put("data", company);
        return retval;
    }
    @RequestMapping("/organizationList")
    public Map<String, Object> getAllOrganization(HttpServletRequest request) {
        Map<String, Object> retval = new HashMap<>();
        List<Org> orgs = userService.getAllOrganization();
        String requestUrl = request.getRequestURL().toString();
        String token = request.getHeader("token").toString();
        System.out.println("========================== Token ====" + token);
        retval.put("requestUrl", requestUrl);
        retval.put("errorCode", 0);
        retval.put("errorMessage", "");
        retval.put("data", orgs);
        return retval;
    }

    @RequestMapping("/codeList")
    public Map<String, Object> getAllCommonCD(HttpServletRequest request) {
        Map<String, Object> retval = new HashMap<>();
        List<CommonCode> codes = userService.getAllCommonCD();
        String requestUrl = request.getRequestURL().toString();
        String token = request.getHeader("token");
        System.out.println("========================== Token ====" + token);
        retval.put("requestUrl", requestUrl);
        retval.put("errorCode", 0);
        retval.put("errorMessage", "");
        retval.put("data", codes);
        return retval;
    }

    @RequestMapping("/token")
    public Map<String, Object> getToken(@RequestHeader("servicekey") String servicekey) {// (HttpServletRequest request) {
        Map<String, Object> retval = new HashMap<>();
        System.out.println( servicekey );
        retval.put("token", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJTRVJWSUNFX0tFWSI6IjUxMDIwODc3NGM2MDE5ZTFmNDU3NmVmNzRmNmFiNDdiZGEyYWExZThkN2Y3YzE5OGMyZTIyYWE2Y2E2ZDBiMTAiLCJpYXQiOjE3MjkwNTYzOTIsImV4cCI6MTcyOTA1Njk5Mn0.JFsy0RExx0xDmKpitfmhMnGwmgIKA5_L4e8mEsKvfuk");
        return retval;
    }
}
