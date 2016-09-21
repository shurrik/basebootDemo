package com.shurrik.demo.rest.test;

import cn.dreampie.client.Client;
import cn.dreampie.client.ClientRequest;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * Created by lip on 2016-09-21.
 */
@FixMethodOrder(MethodSorters.JVM)
public class ClaimBaseRestTest extends  BaseRestTest{
    private Client httpClient;


    @Before
    public void setUp() throws Exception {

//
        httpClient = new Client("http://10.233.70.134:8080/ReimbursePlatform");
//        ClientRequest request = new ClientRequest("/j_spring_security_check");
//        request.addParam("j_username", "admin").addParam("j_password", "admin!@#").addParam("j_remember", "true");
//        httpClient.build(request).post();
    }


    @Test
    public void testLogout() {
//        ClientRequest request = new ClientRequest("/sessions");
//        System.out.println(httpClient.build(request).delete());
    }

    @Test
    public void testALL() {
        ClientRequest request = new ClientRequest("/rest/getMyClaimInfoList.action");
//        request.setJsonParam("2013-03-23 00:00:00");
//    Jsoner.addDeserializer(User.class, ModelDeserializer.instance());
//    System.out.println(Jsoner.toObject(httpClient.build(request).get().getResult(),new TypeReference<List<User>>(){}));
        System.out.println(httpClient.build(request).get());
    }

    @Test
    public void testDispose() {
        ClientRequest request = new ClientRequest("/rest/getMyClaimDisposeList.action");
//        request.setJsonParam("2013-03-23 00:00:00");
//    Jsoner.addDeserializer(User.class, ModelDeserializer.instance());
//    System.out.println(Jsoner.toObject(httpClient.build(request).get().getResult(),new TypeReference<List<User>>(){}));
        System.out.println(httpClient.build(request).get());
    }
}
