
package com.shurrik.demo.service;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shurrik.common.service.IBaseService;
import com.shurrik.common.service.IPageService;
import com.shurrik.demo.dao.IResourceDAO;
import com.shurrik.demo.model.Resource;
public interface IResourceService extends IBaseService<IResourceDAO,Resource>,IPageService<IResourceDAO,Resource>{

	public List<Resource> findMenuByUserIdAndPid(@Param("userId") String userId, @Param("pid") String pid);
}