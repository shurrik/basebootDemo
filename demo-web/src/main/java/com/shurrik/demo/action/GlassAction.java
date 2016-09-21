
package com.shurrik.demo.action;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shurrik.common.domain.view.BizData4Page;
import com.shurrik.demo.model.Glass;
import com.shurrik.demo.service.IGlassService;
import com.shurrik.common.utils.IdGenerator;
import com.shurrik.common.utils.JsonResult;
import com.shurrik.common.utils.PageParam;
import com.shurrik.common.utils.Constants;

@Controller
public class GlassAction extends AbstractAdminController<IGlassService>{

    @Autowired
    private IGlassService glassService;
    
    @RequestMapping(value="/glass/list")
    public String list(Glass glass,ModelMap model,PageParam pageParam,HttpServletRequest request,HttpServletResponse response){

        //获取参数
    	Map<String, Object> conditions = getQueryMap(glass); 	
    	BizData4Page<Glass> pageCtx = doPage(model, conditions, pageParam);
    	model.addAttribute("glass", glass);
    	return "/module/glass/list";
    }    
    
    @RequestMapping(value="/glass/add")
    public String add(ModelMap model,HttpServletRequest request,HttpServletResponse response){

    	model.addAttribute("glass", new Glass());
        return "module/glass/edit";
    }    
    
    @RequestMapping(value="/glass/edit")
    public String edit(String id,ModelMap model,HttpServletRequest request,HttpServletResponse response){
    	
    	Glass glass = glassService.fetch(id);
    	model.addAttribute("glass", glass);
        return "module/glass/edit";
    }    
    
    @RequestMapping(value="/glass/save")
    @ResponseBody
    public String save(HttpServletRequest request,Glass glass){
		boolean isAddNew = StringUtils.isBlank(glass.getId())?true:false;
		if(isAddNew)
		{
			glass.setId(IdGenerator.createNewId());
			glassService.add(glass);
		}
		else
		{
			glassService.update(glass);
		}
        return JsonResult.saveSuccessClose(Constants.MAIN_TAB).toString();
    }    
    
    @RequestMapping(value="/glass/delete")
    @ResponseBody
    public String delete(String ids,HttpServletRequest request){
    	
    	glassService.deleteByIds(ids);
    	return JsonResult.DELETE_SUCCESS.toString();
    }       
	
    protected Map getQueryMap(Glass glass)
    {
    	Map<String, Object> conditions = new HashMap();
    	
		conditions.put("name", glass.getName());		
		conditions.put("price", glass.getPrice());		
		conditions.put("createDate", glass.getCreateDate());		
    	return conditions;
    }

    @Override
    protected IGlassService getMainService() {
        return glassService;
    }

    @Override
    protected String getMainObjName() {
        return "glass";
    }

    @Override
    protected String getViewTitle() {
        return "glass";
    }
}
