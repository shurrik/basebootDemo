
package com.shurrik.demo.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shurrik.common.service.impl.AbstractPageService;
import com.shurrik.demo.dao.IDeptDAO;
import com.shurrik.demo.model.Dept;
import com.shurrik.demo.service.IDeptService;

@SuppressWarnings("unchecked")
@Service("DeptServiceImpl")

public class DeptServiceImpl extends AbstractPageService<IDeptDAO,Dept> implements IDeptService {

	@Autowired
	private IDeptDAO deptDAO;
	@Override
	public boolean getEnableDataPerm() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public IDeptDAO getDao() {
		return deptDAO;
	}
}
