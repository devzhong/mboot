package com.mboot.service.AdminServiceImpl;

import com.mboot.dao.AdminDao;
import com.mboot.entity.Admin;
import com.mboot.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * desc:
 * author:devzhong
 * Date:2019/7/3 11:42
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;

    public void addAdmin(Admin admin){
        adminDao.add(admin);
    }
}
