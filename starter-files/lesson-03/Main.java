// Lección 3: Entrada y salida con Scanner
// PRÁCTICA: haz que el programa te pregunte tus datos y arme tu página personal.
//
// Pasos:
//   1. Lee el nombre con teclado.nextLine() (ya está hecho como ejemplo).
//   2. Pregunta el pasatiempo favorito y guárdalo en la variable pasatiempo.
//   3. Pregunta la edad y guárdala con teclado.nextInt().
//   4. Calcula cuántos años faltan para cumplir 18.
//   5. Completa la página con las respuestas.
//
// Al presionar Run, escribe tus respuestas en la consola y presiona Enter.
// Reto: agrega una pregunta más (por ejemplo, tu comida favorita) y muéstrala.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cómo te llamas? ");
        String nombre = teclado.nextLine();

        // TODO 2: muestra la pregunta del pasatiempo con print y léelo con nextLine()
        String pasatiempo = "";

        // TODO 3: muestra la pregunta de la edad con print y léela con nextInt()
        int edad = 0;

        // TODO 4: calcula cuántos años faltan para cumplir 18
        int aniosParaLos18 = 0;

        System.out.println();
        System.out.println("********** MI PÁGINA **********");
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
        // TODO 5: muestra el pasatiempo y los años que faltan para los 18
        System.out.println("Gracias por visitar mi página.");
        System.out.println("*******************************");

        teclado.close();
    }
}
