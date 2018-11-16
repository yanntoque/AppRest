/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Yann Toqué
 * @author Valentin Lecouple
 */
@XmlRootElement
public class ListeClients {
    private Map<Integer,Client> mapClients;
    private Integer cpt;
    
    public ListeClients(){
        this.mapClients = new HashMap();
        this.cpt = 0;
    }
    
    public void ajouterClientDansListe(Client c){
        this.mapClients.put(cpt, c);
        this.cpt++;
    }
    
    public void modifierClient(int indexClientToEdit, Client newClientValue){
        this.mapClients.replace(indexClientToEdit, newClientValue);
    }
    
    public Client consulterClient(int indexClient){
        System.out.println("LIST CLIENT HERE: INDEX IS: " + indexClient);
        System.out.println("LIST CLIENT HERE: CURRENT CPT IS: " + cpt);
        System.out.println("LIST CLIENT HERE: CLIENT NAME IS: " + this.mapClients.get(indexClient).getNom());
        return(this.mapClients.get(indexClient));
    }
    
    public void supprimerClient(int indexClientToRemove){
        this.mapClients.remove(indexClientToRemove);
    }
    
    public Map consulterListeClient(){
        return(this.mapClients);
    }

    public Map<Integer, Client> getMapClients() {
        return mapClients;
    }

    public void setMapClients(Map<Integer, Client> mapClients) {
        this.mapClients = mapClients;
    }

    public Integer getCpt() {
        return cpt;
    }

    public void setCpt(Integer cpt) {
        this.cpt = cpt;
    }
}
