
package com.shurrik.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shurrik.common.dao.IBaseDAO;
import com.shurrik.demo.model.Message;

public interface IMessageDAO extends IBaseDAO<Message>{

	public List<Message> findNewMsgs(@Param("toId") String toId);
	
	public void readAll(@Param("toId") String toId);
}

