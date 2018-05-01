package com.sebastian.demo.rest;

import javax.json.Json;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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
}
