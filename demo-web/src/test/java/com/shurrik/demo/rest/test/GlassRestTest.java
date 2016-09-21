package com.shurrik.demo.rest.test;

import cn.dreampie.client.ClientRequest;
import cn.dreampie.client.Client;
import cn.dreampie.client.ClientResult;
import cn.dreampie.client.ClientUser;
import cn.dreampie.common.util.json.Jsoner;
import com.shurrik.common.utils.IdGenerator;
import com.shurrik.demo.model.Glass;
import net.sf.json.JSONObject;
import org.apache.http.client.HttpClient;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lip on 2016-09-20.
 */
@FixMethodOrder(MethodSorters.JVM)
public class GlassRestTest extends  BaseRestTest{
    private Client httpClient;

    @Before
    public void setUp() throws Exception {
//        httpClient = new Client("http://localhost:9090/api/v1.0", "/sessions", new ClientUser("xxxxx","123",false));
//        httpClient = new Client(BASE_URL);

        httpClient = new Client("http://localhost:8080");
        ClientRequest request = new ClientRequest("/j_spring_security_check");
        request.addParam("j_username", "admin").addParam("j_password", "admin!@#").addParam("j_remember", "true");
        httpClient.build(request).post();
    }


    @Test
    public void testLogout() {
        ClientRequest request = new ClientRequest("/sessions");
        System.out.println(httpClient.build(request).delete());
    }

    @Test
    public void testALL() {
        ClientRequest request = new ClientRequest("/rest/glass/all");
        request.setJsonParam("2013-03-23 00:00:00");
//    Jsoner.addDeserializer(User.class, ModelDeserializer.instance());
//    System.out.println(Jsoner.toObject(httpClient.build(request).get().getResult(),new TypeReference<List<User>>(){}));
        System.out.println(httpClient.build(request).post());
    }


    @Test
    public void testList() {

        Map<String,Object> queryMap = new HashMap<>();
        queryMap.put("pageCurrent",1);
        queryMap.put("pageSize",20);
        JSONObject obj = JSONObject.fromObject(queryMap);

        ClientRequest request = new ClientRequest("/rest/glass/list");
        request.setJsonParam(obj.toString());

        System.out.println(httpClient.build(request).post());
    }

    @Test
    public void testSave() {

        Glass glass = new Glass();
//        glass.setId(IdGenerator.createNewId());
        glass.setName("王守一笨蛋");
        glass.setPrice(1);

        ClientRequest request = new ClientRequest("/rest/glass/save");
        request.setJsonParam(JSONObject.fromObject(glass).toString());

        System.out.println(httpClient.build(request).post());
    }


    @Test
    public void testPost() {
        ClientRequest request = new ClientRequest("/glass/all");
        request.addParam("params", Jsoner.toJSON(new HashMap<String, String>() {{
            put("a", "哈哈");
        }}));
        System.out.println(httpClient.build(request).post());
    }

    @Test
    public void testDelete() {
        ClientRequest request = new ClientRequest("/tests/1");
        System.out.println(httpClient.build(request).delete());
    }

    @Test
    public void testPut() {
        ClientRequest request = new ClientRequest("/tests/1");
        request.setJsonParam("{\"id\":\"1\",\"username\":\"哈市大\"}");
        System.out.println(httpClient.build(request).put());
    }
//  httpurlconnection patch
//  @Test
//  public void testPatch() {
//    HttpClientRequest request = new HttpClientRequest("/tests/1");
//    request.setJsonParam("{\"id\":\"1\",\"username\":\"k\"}");
//    System.out.println(httpClient.build(request).patch());
//  }

//    @Test
//    public void testUpload() throws FileNotFoundException {
//        //upload
//        ClientRequest uploadRequest = new ClientRequest("/tests/file");
//        uploadRequest.addUploadFile("testfile", ClientTest.class.getResource("/resty.jar").getFile());
//        uploadRequest.addParam("des", "test file  paras  测试笔");
//        ClientResult uploadResult = httpClient.build(uploadRequest).post();
//        System.out.println(uploadResult.getResult());
//    }

//    @Test
//    public void testDownload() {
//        //download  支持断点续传
//        ClientRequest downloadRequest = new ClientRequest("/tests/file");
//        downloadRequest.setDownloadFile(ClientTest.class.getResource("/").getFile(), false);
//        HttpClientResult downloadResult = httpClient.build(downloadRequest).get();
//        System.out.println(downloadResult);
//    }

//    @Test
//    public void testSave() {
//        ClientRequest request = new ClientRequest("/users/1?x");
//        String json = Jsoner.toJSON(
////        new HashMap<String, Object>() {
////          {
////            put("users",
//                new ArrayList() {
//                    {
//                        add(new HashMap<String, String>() {{
//                            put("sid", "1");
//                            put("username", "test1");
//                            put("providername", "test1");
//                            put("password", "123456");
//                            put("created_at", "2014-10-11 10:09:12");
//                        }});
//
//                        add(new HashMap<String, String>() {{
//                            put("sid", "2");
//                            put("username", "test2");
//                            put("providername", "tes2");
//                            put("password", "123456");
//                            put("created_at", "2014-10-12 10:09:12");
//                        }});
//                    }
//                }
//        );
//        request.setJsonParam(json);
//        System.out.println(httpClient.build(request).post());
//    }
}
