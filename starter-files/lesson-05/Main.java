// Lección 5: Métodos y parámetros
// PRÁCTICA: ordena la calculadora de promedio en métodos.
//
// Pasos:
//   1. Completa el método saludar para que muestre "Hola, <nombre>. Veamos cómo te fue."
//   2. Haz que calcularPromedio sume las tres notas y devuelva (return) la suma entre 3.
//   3. Haz que obtenerEstado devuelva "Aprobado" si el promedio es 11 o más,
//      y "Desaprobado" si no.
//   4. En main, usa los métodos con un segundo estudiante.
//
// Reto: crea un método esExcelente(double promedio) que devuelva true si es 18 o más.

public class Main {

    public static void mostrarTitulo() {
        System.out.println("=== CALCULADORA DE PROMEDIO ===");
    }

    public static void saludar(String nombre) {
        System.out.println();
        // TODO 1: muestra el saludo usando el parámetro nombre
    }

    public static double calcularPromedio(double nota1, double nota2, double nota3) {
        // TODO 2: suma las tres notas y devuelve el promedio
        return 0;
    }

    public static String obtenerEstado(double promedio) {
        // TODO 3: devuelve "Aprobado" o "Desaprobado" usando if / else
        return "";
    }

    public static void main(String[] args) {
        mostrarTitulo();

        saludar("Diego");
        double promedioDiego = calcularPromedio(15, 12, 17);
        // String.format("%.1f", x) muestra el número con 1 decimal
        System.out.println("Promedio: " + String.format("%.1f", promedioDiego)
                + " -> " + obtenerEstado(promedioDiego));

        // TODO 4: saluda a otro estudiante, calcula su promedio y muestra su estado
    }
}
