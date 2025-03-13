/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercice2;

/**
 *
 * @author hp
 */
public class TestTripletH {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        
        TripletH<Integer, String, Double> tripletMixte = new TripletH<>(42, "Hello", 3.14);
        System.out.println("Triplet mixte :");
        tripletMixte.affiche();
        System.out.println("Premier élément (Integer) : " + tripletMixte.getPremier());
        System.out.println("Deuxième élément (String) : " + tripletMixte.getSecond());
        System.out.println("Troisième élément (Double) : " + tripletMixte.getTroisieme());

       
        TripletH<String, Boolean, Character> tripletAutre = new TripletH<>("Java", true, 'A');
        System.out.println("\nAutre triplet :");
        tripletAutre.affiche();
        System.out.println("Premier élément (String) : " + tripletAutre.getPremier());
        System.out.println("Deuxième élément (Boolean) : " + tripletAutre.getSecond());
        System.out.println("Troisième élément (Character) : " + tripletAutre.getTroisieme());
    }
}


