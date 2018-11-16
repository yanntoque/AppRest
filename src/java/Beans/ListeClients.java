/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Yann Toqué
 * @author Valentin Lecouple
 */
public class ListeClients {
    Map<Integer,Client> mapClients;
    Integer cpt;
    
    public ListeClients(){
        this.mapClients = new HashMap();
        cpt = 0;
    }
    
    public void ajouterClientDansListe(Client c){
        this.mapClients.put(cpt, c);
        cpt++;
    }
    
    public void modifierClient(int indexClientToEdit, Client newClientValue){
        this.mapClients.replace(indexClientToEdit, newClientValue);
    }
    
    public Client consulterClient(int indexClient){
        return(this.mapClients.get(indexClient));
    }
    
    public void supprimerClient(int indexClientToRemove){
        this.mapClients.remove(indexClientToRemove);
    }
    
    public Map consulterListeClient(){
        return(this.mapClients);
    }
}
