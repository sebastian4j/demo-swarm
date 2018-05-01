package com.sebastian.demo.rest;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * 
 * @author sebastian
 */
@Path("/hello")
public class SwarmRest {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Saludo saludar() {
        var s = new Saludo();
        s.setMensaje("Hola!!");
        return s;
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response despedida() {
        var s = new Saludo();
        s.setMensaje("Chao!!");
        return Response.ok(s).build();
    }    
}
