
package com.shurrik.demo.dao;

import com.shurrik.common.dao.IBaseDAO;
import com.shurrik.demo.model.OpLog;

public interface IOpLogDAO extends IBaseDAO<OpLog>{

	Object addop(OpLog oplog);

}
