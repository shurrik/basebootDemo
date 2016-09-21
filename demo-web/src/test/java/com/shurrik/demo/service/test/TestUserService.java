package com.shurrik.demo.service.test;

import com.shurrik.demo.model.User;
import com.shurrik.demo.service.IUserService;
import com.shurrik.TestBase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by shurrik on 2015/9/2.
 */
public class TestUserService extends TestBase{

    @Autowired
    private IUserService userService;

    @Test
    public void testFindAll()
    {
        List<User> list = userService.findAll();
        assert(list.size()>0);
//        for(User user:list)
//        {
//            System.out.println(user.getRealName());
//        }
    }
}
