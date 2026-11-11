// Lección 8: Proyecto final - Registro de estudiantes
// PRÁCTICA: termina el registro que pide nombres y notas, y muestra el reporte del salón.
//
// Pasos:
//   1. Completa calcularPromedio: suma todas las notas con un for y divide entre notas.length.
//   2. Completa estaAprobado: devuelve true si el promedio es 11 o más.
//   3. En mostrarReporte, cuenta los aprobados y encuentra al mejor promedio.
//
// Escribe las notas con punto decimal (15.5), no con coma.
// Reto: muestra también el promedio general de todo el salón.

import java.util.Scanner;

class Estudiante {
    private String nombre;
    private double[] notas;

    public Estudiante(String nombre, double[] notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public double calcularPromedio() {
        // TODO 1: suma todas las notas con un for y devuelve la suma / notas.length
        return 0;
    }

    public boolean estaAprobado() {
        // TODO 2: devuelve true si calcularPromedio() es 11 o más
        return false;
    }
}

public class Main {
    static final int CANTIDAD_NOTAS = 3;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== REGISTRO DE ESTUDIANTES ===");
        System.out.print("¿Cuántos estudiantes vas a registrar? ");
        int cantidad = Integer.parseInt(teclado.nextLine());

        if (cantidad <= 0) {
            System.out.println("No hay estudiantes para registrar.");
            teclado.close();
            return;
        }

        Estudiante[] salon = new Estudiante[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println();
            System.out.print("Nombre del estudiante " + (i + 1) + ": ");
            String nombre = teclado.nextLine();

            double[] notas = new double[CANTIDAD_NOTAS];
            for (int j = 0; j < CANTIDAD_NOTAS; j++) {
                notas[j] = leerNota(teclado, j + 1);
            }

            // Creamos el objeto y lo guardamos en su posición del arreglo
            salon[i] = new Estudiante(nombre, notas);
        }

        mostrarReporte(salon);
        teclado.close();
    }

    // Ya está lista: pide una nota y repite la pregunta hasta que esté entre 0 y 20
    public static double leerNota(Scanner teclado, int numero) {
        double nota = -1;
        while (nota < 0 || nota > 20) {
            System.out.print("  Nota " + numero + " (0 a 20): ");
            nota = Double.parseDouble(teclado.nextLine());
            if (nota < 0 || nota > 20) {
                System.out.println("  Esa nota no es válida. Inténtalo otra vez.");
            }
        }
        return nota;
    }

    public static void mostrarReporte(Estudiante[] salon) {
        System.out.println();
        System.out.println("========== REPORTE DEL SALÓN ==========");

        Estudiante mejor = salon[0];
        int aprobados = 0;

        for (int i = 0; i < salon.length; i++) {
            Estudiante e = salon[i];
            String estado = "Desaprobado";

            // TODO 3a: si e.estaAprobado(), cambia estado a "Aprobado" y suma 1 a aprobados

            System.out.println(e.getNombre() + " -> promedio "
                    + String.format("%.1f", e.calcularPromedio()) + " (" + estado + ")");

            // TODO 3b: si el promedio de e es mayor que el de mejor, guarda e en mejor
        }

        System.out.println("---------------------------------------");
        System.out.println("Aprobados: " + aprobados + " de " + salon.length);
        System.out.println("Mejor promedio: " + mejor.getNombre()
                + " (" + String.format("%.1f", mejor.calcularPromedio()) + ")");
    }
}
