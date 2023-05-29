package Lab02;

import java.util.*;

public class Problema03 {
    public static void main(String[] args) {
    	
    	
        Scanner sc=new Scanner (System.in);
        System.out.println("Ingresa la base del triangulo a imprimir: ");
        int base = sc.nextInt();
        trianguloRecursivo(base);
    }

    public static void trianguloRecursivo(int b) {
        if (b > 0) {
            trianguloRecursivo(b - 1); //uso del metodo recursivamente
            for (int i = 0; i < b; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
