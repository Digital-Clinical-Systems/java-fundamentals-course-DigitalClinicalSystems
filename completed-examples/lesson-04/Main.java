// Lección 4: Estructuras de control: decisiones (if-else) y bucles (for, while)
// Solución: edad, notas, tablas de multiplicar y ahorro para unas zapatillas.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // ---------- Parte 1: if / else (dos caminos) ----------
        System.out.print("¿Cuántos años tienes? ");
        int edad = teclado.nextInt();

        if (edad >= 18) {
            System.out.println("Ya eres mayor de edad.");
        } else {
            System.out.println("Te faltan " + (18 - edad) + " años para cumplir 18.");
        }

        // ---------- Parte 2: else if (varios caminos) ----------
        System.out.print("Ingresa tu nota (0 a 20): ");
        int nota = teclado.nextInt();

        // || significa "o": basta con que una de las dos sea verdad
        if (nota < 0 || nota > 20) {
            System.out.println("Esa nota no existe. Debe estar entre 0 y 20.");
        } else if (nota >= 18) {
            System.out.println("¡Logro destacado! Te luciste.");
        } else if (nota >= 14) {
            System.out.println("Muy bien, vas por buen camino.");
        } else if (nota >= 11) {
            System.out.println("Aprobaste. Con un poco más de práctica subes.");
        } else {
            System.out.println("Esta vez no salió, pero se puede recuperar.");
        }

        // ---------- Parte 3: for (sabemos cuántas veces repetir) ----------
        System.out.print("¿Qué tabla de multiplicar quieres ver? ");
        int numero = teclado.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        // ---------- Parte 4: while (repetimos MIENTRAS algo sea verdad) ----------
        int precioZapatillas = 250;
        int ahorroSemanal = 30;
        int ahorrado = 0;
        int semanas = 0;

        while (ahorrado < precioZapatillas) {
            ahorrado += ahorroSemanal;
            semanas++; // atajo de: semanas = semanas + 1
            System.out.println("Semana " + semanas + ": llevas S/ " + ahorrado);
        }

        System.out.println("¡Listo! En " + semanas + " semanas juntas para tus zapatillas.");

        teclado.close();
    }
}
