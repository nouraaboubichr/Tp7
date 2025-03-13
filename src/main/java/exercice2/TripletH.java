/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercice2;

/**
 *
 * @author hp
 */

public class TripletH<T1, T2, T3> {
    private T1 premier;
    private T2 second;
    private T3 troisieme;

    
    public TripletH(T1 premier, T2 second, T3 troisieme) {
        this.premier = premier;
        this.second = second;
        this.troisieme = troisieme;
    }

    
    public T1 getPremier() {
        return premier;
    }

    public T2 getSecond() {
        return second;
    }

    public T3 getTroisieme() {
        return troisieme;
    }

    
    public void affiche() {
        System.out.println("(" + premier + ", " + second + ", " + troisieme + ")");
    }
}

