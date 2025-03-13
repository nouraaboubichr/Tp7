/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.projet;

/**
 *
 * @author hp
 */
public abstract class Personne {
    protected int id;
    protected String nom;
    protected String prenom;
    protected double salaire;

    
    public Personne(int id, String nom, String prenom, double salaire) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    
    public abstract double calculerSalaire();

    
    public String affiche() {
        return "ID: " + id + ", Nom: " + nom + ", Prénom: " + prenom + ", Salaire: " + calculerSalaire();
    }
}
