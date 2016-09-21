
package com.shurrik.demo.service;
import com.shurrik.common.service.IBaseService;
import com.shurrik.common.service.IPageService;
import com.shurrik.demo.dao.IVersionDAO;
import com.shurrik.demo.model.Version;
public interface IVersionService extends IBaseService<IVersionDAO,Version>,IPageService<IVersionDAO,Version>{

}