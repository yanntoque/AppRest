/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicesRest;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Yann Toqué
 * @author Valentin Lecouple
 */
@Path("client")
public class ClientWS {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Services
     */
    public ClientWS() {
    }

    /**
     * Retrieves representation of an instance of ServicesRest.ClientWS
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getText() {
        //TODO return proper representation object
        return "ici method getText";
    }

    /**
     * PUT method for updating or creating an instance of ClientWS
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.TEXT_PLAIN)
    public void putText(String content) {
    }
}
