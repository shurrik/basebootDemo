
package com.shurrik.demo.service;
import com.shurrik.common.service.IBaseService;
import com.shurrik.common.service.IPageService;
import com.shurrik.demo.dao.IRoleDAO;
import com.shurrik.demo.model.Role;
public interface IRoleService extends IBaseService<IRoleDAO,Role>,IPageService<IRoleDAO,Role>{

}