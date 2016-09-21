
package com.shurrik.demo.service;
import com.shurrik.common.service.IBaseService;
import com.shurrik.common.service.IPageService;
import com.shurrik.demo.dao.ISettingDAO;
import com.shurrik.demo.model.Setting;
public interface ISettingService extends IBaseService<ISettingDAO,Setting>,IPageService<ISettingDAO,Setting>{

}