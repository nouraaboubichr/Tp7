/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fibonacci;

/**
 *
 * @author hp
 */
public class Fibonacci {
    public static int fibonacci(int n) throws NombreNegatifException {
        if (n <= 0) {
            throw new NombreNegatifException("Erreur : L'entier doit être supérieur à 0.");
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}