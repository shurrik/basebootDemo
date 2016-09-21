
package com.shurrik.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shurrik.common.dao.IBaseDAO;
import com.shurrik.demo.model.Resource;

public interface IResourceDAO extends IBaseDAO<Resource>{
	public List<Resource> findMenuByUserIdAndPid(@Param("userId") String userId, @Param("pid") String pid);
}
