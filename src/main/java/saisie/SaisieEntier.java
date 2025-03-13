/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package saisie;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class SaisieEntier {
    public static int saisieCorrecte() {
        Scanner scanner = new Scanner(System.in);
        int nombre = 0;
        boolean saisieValide = false;

        while (!saisieValide) {
            try {
                System.out.print("Veuillez saisir un entier (> 10) : ");
                nombre = scanner.nextInt();

               
                if (nombre <= 10) {
                    throw new NombreInferieurException("Erreur : L'entier doit être supérieur à 10.");
                }

                saisieValide = true; 
            } catch (InputMismatchException e) {
                System.out.println("Erreur : Veuillez entrer un nombre entier valide.");
                scanner.next(); 
            } catch (NombreInferieurException e) {
                System.out.println(e.getMessage());
            }
        }
        return nombre;
    }

    
}
