package com.zistrong.jakartaee.rest;

import com.zistrong.jakartaee.entitiy.MyModel;
import com.zistrong.jakartaee.entitiy.Production;
import jakarta.inject.Inject;
import jakarta.mvc.Controller;
import jakarta.mvc.Models;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/controller")
@Controller
public class MyController {


    @Inject
    Models models;

    @Inject
    HttpServletRequest httpServletRequest;

    @Inject
    MyModel myModel;


    @GET
    @Path("/")
    public String index() {
        System.out.println(httpServletRequest.getServletPath());
        Production production = new Production();
        production.setId(1L);
        production.setName("p1");
        models.put("time", System.nanoTime());
        models.put("production", production);
        return "/view/production.jsp";
    }
    @GET
    @Path("/url")
    public String url() {

        myModel.setM1("M1");

        return "/view/production.jsp";
    }
}
