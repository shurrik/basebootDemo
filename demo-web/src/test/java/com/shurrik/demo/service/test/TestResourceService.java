package com.shurrik.demo.service.test;

import com.shurrik.TestBase;
import com.shurrik.demo.model.Resource;
import com.shurrik.demo.model.User;
import com.shurrik.demo.service.IResourceService;
import com.shurrik.demo.service.IUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class TestResourceService extends TestBase {

    @Autowired
    private IResourceService resourceService;

    @Test
    public void testFindAll()
    {
        List<Resource> list = resourceService.findAll();
        for(Resource res:list)
        {
            System.out.println(res.getName());
        }
    }
}
