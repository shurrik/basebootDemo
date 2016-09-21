
package com.shurrik.demo.service;
import com.shurrik.common.service.IBaseService;
import com.shurrik.common.service.IPageService;
import com.shurrik.demo.dao.IUserRoleDAO;
import com.shurrik.demo.model.UserRole;
public interface IUserRoleService extends IBaseService<IUserRoleDAO,UserRole>,IPageService<IUserRoleDAO,UserRole>{

}