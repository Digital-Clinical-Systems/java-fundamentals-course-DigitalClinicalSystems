// Lección 3: Entrada y salida con Scanner
// Solución: el programa te pregunta tus datos y arma tu "página personal".

import java.util.Scanner; // traemos Scanner desde la biblioteca de Java

public class Main {
    public static void main(String[] args) {
        // Creamos un Scanner que "escucha" lo que escribes en el teclado
        Scanner teclado = new Scanner(System.in);

        // print deja el cursor en la misma línea, así respondes al costado
        System.out.print("¿Cómo te llamas? ");
        String nombre = teclado.nextLine();      // nextLine lee una línea de texto

        System.out.print("¿Cuál es tu pasatiempo favorito? ");
        String pasatiempo = teclado.nextLine();

        System.out.print("¿Cuántos años tienes? ");
        int edad = teclado.nextInt();            // nextInt lee un número entero

        int aniosParaLos18 = 18 - edad;

        // Salida: usamos las respuestas para armar la página
        System.out.println();
        System.out.println("********** MI PÁGINA **********");
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
        System.out.println("En mi tiempo libre me encanta: " + pasatiempo + ".");
        System.out.println("Me faltan " + aniosParaLos18 + " años para cumplir 18.");
        System.out.println("Gracias por visitar mi página.");
        System.out.println("*******************************");

        teclado.close(); // cerramos el Scanner cuando ya no lo usamos
    }
}
