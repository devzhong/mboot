package com.mboot.dao;

import com.mboot.entity.Admin;
import org.springframework.stereotype.Repository;

/**
 * desc:
 * author:devzhong
 * Date:2019/7/3 11:03
 */
@Repository
public interface AdminDao {

    void add(Admin admin);
}
