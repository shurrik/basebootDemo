
package com.shurrik.demo.service;
import com.shurrik.common.service.IBaseService;
import com.shurrik.common.service.IPageService;
import com.shurrik.demo.dao.IGlassDAO;
import com.shurrik.demo.model.Glass;
public interface IGlassService extends IBaseService<IGlassDAO,Glass>,IPageService<IGlassDAO,Glass>{

}