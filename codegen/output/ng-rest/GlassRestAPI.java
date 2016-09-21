
package com.shurrik.demo.rest.api;

import com.shurrik.common.domain.view.BizData4Page;
import com.shurrik.demo.model.Glass;
import com.shurrik.demo.service.IGlassService;
import com.shurrik.demo.util.PageParam;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by fzy on 2016/8/17.
 */
@Path("/glass")
public class GlassRestAPI extends BaseRestAPI<IGlassService>{

    @Autowired
    private IGlassService glassService;

    @POST
    @Path("/list")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public BizData4Page<Glass> list(Map<String,Object> map){

        Map<String, Object> conditions = getQueryMap(map);
        PageParam pageParam = getPageParam(map);
        BizData4Page<Glass> pageCtx = doPage(conditions, pageParam);
        return  pageCtx;
    }

    @POST
    @Path("/edit")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Glass save(Map<String,Object> map){

        String editId = (String) map.get("editId");
        Glass glass = glassService.fetch(editId);
        return glass;
    }

    @POST
    @Path("/save")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Glass save(Glass glass){

        if(StringUtils.isBlank(glass.getId()))
        {
            glassService.add(glass);
        }
        else
        {
            glassService.update(glass);
        }
        return glass;
    }

    @POST
    @Path("/delete")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void delete(Map<String,Object> map){

        String editId = (String) map.get("editId");
        glassService.deleteById(editId);
    }

    protected Map getQueryMap(Map<String,Object> map) {
        Map<String, Object> conditions = new HashMap();
		conditions.put("name", (String)map.get("name"));	
		conditions.put("price", (String)map.get("price"));	
		conditions.put("createDate", (String)map.get("createDate"));	
        
        return conditions;
    }

    @Override
    protected IGlassService getMainService() {
        return glassService;
    }
}
