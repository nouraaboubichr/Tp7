/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.projet;

import java.util.List;

/**
 *
 * @author hp
 */
public class PersonneUtils {
    public static void afficherPersonnes(List<? extends Personne> personnes) {
        for (Personne p : personnes) {
            System.out.println(p.affiche());
        }
    }
}