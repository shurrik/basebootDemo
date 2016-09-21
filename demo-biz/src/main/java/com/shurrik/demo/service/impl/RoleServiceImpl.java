
package com.shurrik.demo.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shurrik.common.service.impl.AbstractPageService;
import com.shurrik.demo.dao.IRoleDAO;
import com.shurrik.demo.model.Role;
import com.shurrik.demo.service.IRoleService;

@SuppressWarnings("unchecked")
@Service("RoleServiceImpl")

public class RoleServiceImpl extends AbstractPageService<IRoleDAO,Role> implements IRoleService {

	@Autowired
	private IRoleDAO roleDAO;
	@Override
	public boolean getEnableDataPerm() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public IRoleDAO getDao() {
		return roleDAO;
	}
}
