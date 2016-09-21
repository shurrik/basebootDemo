
package com.shurrik.demo.service;
import com.shurrik.common.service.IBaseService;
import com.shurrik.common.service.IPageService;
import com.shurrik.demo.dao.IOpLogDAO;
import com.shurrik.demo.model.OpLog;
import com.shurrik.demo.model.User;
public interface IOpLogService extends IBaseService<IOpLogDAO,OpLog>,IPageService<IOpLogDAO,OpLog>{


	public	void createNew(String title, String content, User user);
}