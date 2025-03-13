/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.projet.bean;

import ma.projet.Personne;

/**
 *
 * @author hp
 */
public class Manager extends Personne {
    private String service;

    
    public Manager(int id, String nom, String prenom, double salaire, String service) {
        super(id, nom, prenom, salaire);
        this.service = service;
    }

    
    @Override
    public double calculerSalaire() {
        return salaire * 1.30; 
    }

    
    @Override
    public String affiche() {
        return super.affiche() + ", Service: " + service;
    }
}