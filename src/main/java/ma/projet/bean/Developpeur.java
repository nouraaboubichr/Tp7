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
public class Developpeur extends Personne {
    private String specialite;

    
    public Developpeur(int id, String nom, String prenom, double salaire, String specialite) {
        super(id, nom, prenom, salaire);
        this.specialite = specialite;
    }

    
    @Override
    public double calculerSalaire() {
        return salaire * 1.10;     }

    
    @Override
    public String affiche() {
        return super.affiche() + ", Spécialité: " + specialite;
    }
}
