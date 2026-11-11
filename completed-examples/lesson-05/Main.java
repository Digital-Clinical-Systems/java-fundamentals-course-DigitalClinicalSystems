// Lección 5: Métodos y parámetros
// Solución: una calculadora de promedio del cole, ordenada en métodos.

public class Main {

    // Método sin parámetros y sin retorno (void): solo hace algo
    public static void mostrarTitulo() {
        System.out.println("=== CALCULADORA DE PROMEDIO ===");
    }

    // Método con un parámetro: recibe un dato y lo usa
    public static void saludar(String nombre) {
        System.out.println();
        System.out.println("Hola, " + nombre + ". Veamos cómo te fue.");
    }

    // Método con parámetros y retorno: calcula y DEVUELVE un resultado
    public static double calcularPromedio(double nota1, double nota2, double nota3) {
        double suma = nota1 + nota2 + nota3;
        return suma / 3;
    }

    // Método que devuelve un texto según el promedio
    public static String obtenerEstado(double promedio) {
        if (promedio >= 11) {
            return "Aprobado";
        } else {
            return "Desaprobado";
        }
    }

    public static void main(String[] args) {
        mostrarTitulo();

        saludar("Diego");
        double promedioDiego = calcularPromedio(15, 12, 17);
        // String.format("%.1f", x) muestra el número con 1 decimal
        System.out.println("Promedio: " + String.format("%.1f", promedioDiego)
                + " -> " + obtenerEstado(promedioDiego));

        // Reutilizamos los mismos métodos con otros datos
        saludar("Camila");
        double promedioCamila = calcularPromedio(9, 11, 10);
        System.out.println("Promedio: " + String.format("%.1f", promedioCamila)
                + " -> " + obtenerEstado(promedioCamila));
    }
}
