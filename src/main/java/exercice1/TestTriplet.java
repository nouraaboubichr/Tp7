/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercice1;

/**
 *
 * @author hp
 */
public class TestTriplet {
    public static void main(String[] args) {
        
        Triplet<Integer> tripletEntiers = new Triplet<>(10, 20, 30);
        System.out.println("Triplet d'entiers :");
        tripletEntiers.affiche();
        System.out.println("Premier élément : " + tripletEntiers.getPremier());

       
        Triplet<String> tripletString = new Triplet<>("Alice", "Bob", "Charlie");
        System.out.println("\nTriplet de chaînes :");
        tripletString.affiche();
        System.out.println("Deuxième élément : " + tripletString.getSecond());

        
        Triplet<Double> tripletDoubles = new Triplet<>(3.14, 2.71, 1.61);
        System.out.println("\nTriplet de nombres réels :");
        tripletDoubles.affiche();
        System.out.println("Troisième élément : " + tripletDoubles.getTroisieme());
    }
}
