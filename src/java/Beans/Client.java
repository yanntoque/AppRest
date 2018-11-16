/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Yann Toqué
 * @author Valentin Lecouple
 */
@XmlRootElement
public class Client {
    
    private String nom;
    private String prenom;
    
    public Client(){}
    
    public Client(String nom, String prenom){
        this.setNom(nom);
        this.setPrenom(prenom);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    

}
