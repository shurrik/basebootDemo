package com.shurrik.demo.directive;


import static freemarker.template.ObjectWrapper.DEFAULT_WRAPPER;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shurrik.demo.model.Resource;
import com.shurrik.demo.model.User;
import com.shurrik.demo.service.IResourceService;

import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

@Service
public class MenuListDirective extends BaseDirective{


	@Autowired
	private IResourceService resourceService;
	
	@Override
	@SuppressWarnings("unchecked")
	protected Map<String, TemplateModel> putRes(Environment env, Map params,
			TemplateModel[] loopVars, TemplateDirectiveBody body)
			throws TemplateException {
		Map<String, TemplateModel> paramWrap = new HashMap<String, TemplateModel>(params);
		String pid = DirectiveUtils.getString("pid", params) != null ? DirectiveUtils.getString("pid", params) : null;
		User user = getCurrentUser();
		List<Resource> resources = resourceService.findMenuByUserIdAndPid(user.getId(), pid);
		paramWrap.put("resources", DEFAULT_WRAPPER.wrap(resources));
		return paramWrap;
	}	
	
}
