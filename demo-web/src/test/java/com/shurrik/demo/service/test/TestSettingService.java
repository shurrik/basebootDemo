package com.shurrik.demo.service.test;

import com.shurrik.TestBase;
import com.shurrik.demo.model.Setting;
import com.shurrik.demo.model.User;
import com.shurrik.demo.service.ISettingService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by lip on 2016-01-22.
 */
public class TestSettingService extends TestBase {

    @Autowired
    private ISettingService settingService;

    @Test
    public void testFindAll()
    {
        List<Setting> list = settingService.findAll();
        assert(list.size()>0);
//        for(User user:list)
//        {
//            System.out.println(user.getRealName());
//        }
    }
}
