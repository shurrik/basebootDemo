
package com.shurrik.demo.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shurrik.common.service.impl.AbstractPageService;
import com.shurrik.demo.dao.IRoleResourceDAO;
import com.shurrik.demo.model.RoleResource;
import com.shurrik.demo.service.IRoleResourceService;

@SuppressWarnings("unchecked")
@Service("RoleResourceServiceImpl")

public class RoleResourceServiceImpl extends AbstractPageService<IRoleResourceDAO,RoleResource> implements IRoleResourceService {

	@Autowired
	private IRoleResourceDAO roleResourceDAO;
	@Override
	public boolean getEnableDataPerm() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public IRoleResourceDAO getDao() {
		return roleResourceDAO;
	}
}
