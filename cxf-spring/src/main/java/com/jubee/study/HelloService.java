package com.jubee.study;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

public class HelloService {

    @GET
    @Path("/jubee/")
    public String jubee() {
        return "Hello from Jubee!";
    }

    @GET
    @Path("/yulya/")
    public String yulya() {
        return "Hello from Yulya!";
    }
}
