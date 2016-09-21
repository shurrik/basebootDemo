
package com.shurrik.demo.service;
import com.shurrik.common.service.IBaseService;
import com.shurrik.common.service.IPageService;
import com.shurrik.demo.dao.IDeptDAO;
import com.shurrik.demo.model.Dept;
public interface IDeptService extends IBaseService<IDeptDAO,Dept>,IPageService<IDeptDAO,Dept>{

}