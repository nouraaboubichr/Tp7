/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

import static fibonacci.Fibonacci.fibonacci;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class test {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombre = 0;
        boolean saisieValide = false;

        while (!saisieValide) {
            try {
                System.out.print("Veuillez saisir un entier positif (> 0) : ");
                nombre = scanner.nextInt();

                
                if (nombre <= 0) {
                    throw new NombreNegatifException("Erreur : L'entier doit être supérieur à 0.");
                }

                saisieValide = true;
            } catch (InputMismatchException e) {
                System.out.println("Erreur : Veuillez entrer un nombre entier valide.");
                scanner.next(); 
            } catch (NombreNegatifException e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            int resultat = fibonacci(nombre);
            System.out.println("Le " + nombre + "ème nombre de Fibonacci est : " + resultat);
        } catch (NombreNegatifException e) {
            System.out.println(e.getMessage());
        }
    }
}
    

