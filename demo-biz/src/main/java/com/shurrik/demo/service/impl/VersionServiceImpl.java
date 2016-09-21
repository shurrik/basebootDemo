
package com.shurrik.demo.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shurrik.common.service.impl.AbstractPageService;
import com.shurrik.demo.dao.IVersionDAO;
import com.shurrik.demo.model.Version;
import com.shurrik.demo.service.IVersionService;

@SuppressWarnings("unchecked")
@Service("VersionServiceImpl")

public class VersionServiceImpl extends AbstractPageService<IVersionDAO,Version> implements IVersionService {

	@Autowired
	private IVersionDAO versionDAO;
	@Override
	public boolean getEnableDataPerm() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public IVersionDAO getDao() {
		return versionDAO;
	}
}
