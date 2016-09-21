
package com.shurrik.demo.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shurrik.common.service.impl.AbstractPageService;
import com.shurrik.demo.dao.ISettingDAO;
import com.shurrik.demo.model.Setting;
import com.shurrik.demo.service.ISettingService;

@SuppressWarnings("unchecked")
@Service("SettingServiceImpl")

public class SettingServiceImpl extends AbstractPageService<ISettingDAO,Setting> implements ISettingService {

	@Autowired
	private ISettingDAO settingDAO;
	@Override
	public boolean getEnableDataPerm() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public ISettingDAO getDao() {
		return settingDAO;
	}
}
