/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package esprimo;
import java.util.Scanner;

/**
 *
 * @author cherry
 */
public class EsPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Un número primo es aquel que sea solo divisible por sí mismo y la unidad
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número");
        int numero = sc.nextInt();
        String resultado = (primo(numero)) ? "El número es primo" : "El número no es primo";
        System.out.println(resultado);
    }

    public static boolean primo(int num) {
        boolean cierto = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                cierto = false;
            }// cierre del if
        }// cierre del for
        return cierto;
    }
}