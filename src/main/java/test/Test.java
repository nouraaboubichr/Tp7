/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.List;
import ma.projet.Personne;
import ma.projet.PersonneUtils;
import ma.projet.bean.Developpeur;
import ma.projet.bean.Manager;

/**
 *
 * @author hp
 */
public class Test {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        List<Personne> personnes = new ArrayList<>();
        personnes.add(new Developpeur(1, "Ali", "Mehdi", 4000, "Java"));
        personnes.add(new Manager(2, "Sophie", "Durand", 6000, "IT"));

       
        System.out.println("Liste des personnes :");
        PersonneUtils.afficherPersonnes(personnes);
    }
    
}

