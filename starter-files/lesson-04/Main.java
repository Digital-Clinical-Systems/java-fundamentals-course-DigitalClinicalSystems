// Lección 4: Estructuras de control: decisiones (if-else) y bucles (for, while)
// PRÁCTICA: haz que tu programa decida y repita.
//
// Pasos:
//   1. Completa el else de la edad.
//   2. Agrega los else if que faltan para clasificar la nota.
//   3. Escribe el for que muestra la tabla de multiplicar del 1 al 10.
//   4. Escribe el while que suma el ahorro semana por semana.
//
// Al presionar Run, responde en la consola y presiona Enter.
// Reto: cambia el ahorro semanal a 45. ¿Cuántas semanas tardas ahora?

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // ---------- Parte 1: if / else ----------
        System.out.print("¿Cuántos años tienes? ");
        int edad = teclado.nextInt();

        if (edad >= 18) {
            System.out.println("Ya eres mayor de edad.");
        } else {
            // TODO 1: muestra cuántos años faltan para cumplir 18
        }

        // ---------- Parte 2: else if ----------
        System.out.print("Ingresa tu nota (0 a 20): ");
        int nota = teclado.nextInt();

        if (nota < 0 || nota > 20) {
            System.out.println("Esa nota no existe. Debe estar entre 0 y 20.");
        } else if (nota >= 18) {
            System.out.println("¡Logro destacado! Te luciste.");
        }
        // TODO 2: agrega un else if para nota >= 14, otro para nota >= 11
        //         y un else final para las notas menores a 11

        // ---------- Parte 3: for ----------
        System.out.print("¿Qué tabla de multiplicar quieres ver? ");
        int numero = teclado.nextInt();

        // TODO 3: escribe un for con i desde 1 hasta 10 que muestre:
        //         numero + " x " + i + " = " + (numero * i)

        // ---------- Parte 4: while ----------
        int precioZapatillas = 250;
        int ahorroSemanal = 30;
        int ahorrado = 0;
        int semanas = 0;

        // TODO 4: mientras ahorrado sea menor que precioZapatillas:
        //         suma ahorroSemanal a ahorrado, suma 1 a semanas
        //         y muestra "Semana X: llevas S/ Y"

        System.out.println("¡Listo! En " + semanas + " semanas juntas para tus zapatillas.");

        teclado.close();
    }
}
