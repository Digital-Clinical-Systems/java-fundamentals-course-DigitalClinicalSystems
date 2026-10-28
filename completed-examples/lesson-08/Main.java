// Lección 8: Proyecto final - Registro de estudiantes
// Solución: junta clases, encapsulación, arreglos, métodos, Scanner, if y bucles.

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

    // Cada estudiante sabe calcular su propio promedio
    public double calcularPromedio() {
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma / notas.length;
    }

    public boolean estaAprobado() {
        return calcularPromedio() >= 11;
    }
}

public class Main {
    // final: una constante, un valor que no cambia en todo el programa
    static final int CANTIDAD_NOTAS = 3;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== REGISTRO DE ESTUDIANTES ===");
        System.out.print("¿Cuántos estudiantes vas a registrar? ");
        // Leemos todo con nextLine y lo convertimos: así evitamos saltos raros del Scanner
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

            salon[i] = new Estudiante(nombre, notas);
        }

        mostrarReporte(salon);
        teclado.close();
    }

    // Pide una nota y repite la pregunta hasta que esté entre 0 y 20
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

    // Muestra el promedio de cada estudiante, cuántos aprobaron y el mejor promedio
    public static void mostrarReporte(Estudiante[] salon) {
        System.out.println();
        System.out.println("========== REPORTE DEL SALÓN ==========");

        Estudiante mejor = salon[0];
        int aprobados = 0;

        for (int i = 0; i < salon.length; i++) {
            Estudiante e = salon[i];

            String estado;
            if (e.estaAprobado()) {
                estado = "Aprobado";
                aprobados++;
            } else {
                estado = "Desaprobado";
            }

            System.out.println(e.getNombre() + " -> promedio "
                    + String.format("%.1f", e.calcularPromedio()) + " (" + estado + ")");

            if (e.calcularPromedio() > mejor.calcularPromedio()) {
                mejor = e;
            }
        }

        System.out.println("---------------------------------------");
        System.out.println("Aprobados: " + aprobados + " de " + salon.length);
        System.out.println("Mejor promedio: " + mejor.getNombre()
                + " (" + String.format("%.1f", mejor.calcularPromedio()) + ")");
    }
}
