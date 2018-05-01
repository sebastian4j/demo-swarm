package com.sebastian.demo.rest;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * 
 * @author sebastian
 */
@Path("/hello")
public class SwarmApp {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Saludo saludar() {
        final Saludo s = new Saludo();
        s.setMensaje("Hola!!");
        return s;
    }
}
