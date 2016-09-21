package com.shurrik.demo.directive;

import static freemarker.template.ObjectWrapper.DEFAULT_WRAPPER;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shurrik.demo.model.Message;
import com.shurrik.demo.model.User;
import com.shurrik.demo.model.UserMsgCount;
import com.shurrik.demo.service.IMessageService;
import com.shurrik.demo.service.IUserMsgCountService;

import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

@Service
public class UserMsgCountDirective extends BaseDirective{

	
	@Autowired
	private IUserMsgCountService userMsgCountService;
	@Autowired
	private IMessageService messageService;	
	
	@Override
	@SuppressWarnings("unchecked")
	protected Map<String, TemplateModel> putRes(Environment env, Map params,
			TemplateModel[] loopVars, TemplateDirectiveBody body)
			throws TemplateException {
		Map<String, TemplateModel> paramWrap = new HashMap<String, TemplateModel>(params);
		User user = getCurrentUser();
		UserMsgCount msgCount =  userMsgCountService.findOne("userId", user.getId());
		if(null!= msgCount&&msgCount.getUnread()>0)
		{
			List<Message> msgs = messageService.findNewMsgs(user.getId());
			paramWrap.put("msgs", DEFAULT_WRAPPER.wrap(msgs));
			paramWrap.put("unread", DEFAULT_WRAPPER.wrap(msgCount.getUnread()));
		}
		return paramWrap;
	}
}
