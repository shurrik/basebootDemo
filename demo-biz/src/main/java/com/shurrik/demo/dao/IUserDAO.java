package com.shurrik.demo.dao;

import java.util.List;

import com.shurrik.common.dao.IBaseDAO;
import com.shurrik.demo.model.User;


public interface IUserDAO extends IBaseDAO<User>{

	public	List<User> findRoleUser();

}
