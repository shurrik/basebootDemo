
package com.shurrik.demo.service;
import com.shurrik.common.service.IBaseService;
import com.shurrik.common.service.IPageService;
import com.shurrik.demo.dao.IRoleResourceDAO;
import com.shurrik.demo.model.RoleResource;
public interface IRoleResourceService extends IBaseService<IRoleResourceDAO,RoleResource>,IPageService<IRoleResourceDAO,RoleResource>{

}