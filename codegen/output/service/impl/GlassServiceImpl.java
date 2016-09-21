
package com.shurrik.demo.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shurrik.common.service.impl.AbstractPageService;
import com.shurrik.demo.dao.IGlassDAO;
import com.shurrik.demo.model.Glass;
import com.shurrik.demo.service.IGlassService;

@SuppressWarnings("unchecked")
@Service("GlassServiceImpl")

public class GlassServiceImpl extends AbstractPageService<IGlassDAO,Glass> implements IGlassService {

	@Autowired
	private IGlassDAO glassDAO;
	@Override
	public boolean getEnableDataPerm() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public IGlassDAO getDao() {
		return glassDAO;
	}
}
