/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicesRest;

import Beans.Client;
import Beans.ListeClients;
import java.util.Map;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.DELETE;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Yann Toqué
 * @author Valentin Lecouple
 */
@Path("client")
public class ClientWS {
    
    private static ListeClients lstClients = new ListeClients();
    
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
    @Path("{id}")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_XML)
    public Client getClient(@PathParam("id") int id) {
        Client getClient = lstClients.consulterClient(id);
        System.out.println(getClient.getPrenom());
        return(getClient);
    }

    /**
     * PUT method for updating or creating an instance of ClientWS
     * @param nom
     * @param prenom
     */
    @POST
    @Path("{nom}/{prenom}")
    @Consumes(MediaType.TEXT_PLAIN)
    public void postNewClient(@PathParam("nom") String nom, @PathParam("prenom") String prenom) {
        Client newClient = new Client(nom, prenom);
        lstClients.ajouterClientDansListe(newClient);
    }
    
    @PUT
    @Path("{id}/{nom}/{prenom}")
    @Consumes(MediaType.TEXT_PLAIN)
    public void updateClient(@PathParam("id") int id, @PathParam("nom") String nom, @PathParam("prenom") String prenom){
        lstClients.consulterClient(id).setNom(nom);
        lstClients.consulterClient(id).setPrenom(prenom);
    }
    
    @DELETE
    @Path("{id}")
    @Consumes(MediaType.TEXT_PLAIN)
    public void deleteClient(@PathParam("id") int id){
        lstClients.supprimerClient(id);
    }
    
    @GET
    @Path("all")
    @Produces(MediaType.APPLICATION_XML)
    public ListeClients getAllClients(){
        return lstClients;
    }
}
