package com.mboot.controller;

import com.mboot.entity.Admin;
import com.mboot.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * desc:
 * author:devzhong
 * Date:2019/7/3 11:05
 */

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addAdmin(@RequestBody Admin admin){
        adminService.addAdmin(admin);
        return "add success";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(){
        return "kobe";
    }
}
