/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercice1;

/**
 *
 * @author hp
 */

public class Triplet<T> {
    private T premier;
    private T second;
    private T troisieme;

   
    public Triplet(T premier, T second, T troisieme) {
        this.premier = premier;
        this.second = second;
        this.troisieme = troisieme;
    }

   
    public T getPremier() {
        return premier;
    }

    public T getSecond() {
        return second;
    }

    public T getTroisieme() {
        return troisieme;
    }

    
    public void affiche() {
        System.out.println("(" + premier + ", " + second + ", " + troisieme + ")");
    }
}

