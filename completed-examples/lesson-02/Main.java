// Lección 2: Variables, tipos de datos y operadores
// Solución: el perfil de un personaje de videojuego.

public class Main {
    public static void main(String[] args) {
        // Una variable es una caja con nombre que guarda un dato
        String nombreJugador = "ShadowFox"; // String: texto, entre comillas dobles
        char rango = 'B';                   // char: un solo carácter, entre comillas simples
        int experiencia = 1250;             // int: número entero
        double precision = 87.5;            // double: número con decimales (se usa punto)
        boolean tieneEscudo = true;         // boolean: solo true o false

        // Operadores aritméticos:  +  -  *  /  %
        int nivel = experiencia / 100;        // 1250 / 100 = 12 (división entera)
        int expSobrante = experiencia % 100;  // % da el resto de la división: 50
        int expParaSubir = 100 - expSobrante; // 50

        int vida = 100;
        int golpe = 35;
        vida = vida - golpe;                  // la caja "vida" ahora guarda 65

        int monedas = 40;
        monedas += 25;                        // atajo de: monedas = monedas + 25

        int ataque = 18;
        int ataqueCritico = ataque * 2;       // 36

        // Con textos, el + une (concatena)
        System.out.println("=== PERFIL DEL JUGADOR ===");
        System.out.println("Jugador: " + nombreJugador + " (rango " + rango + ")");
        System.out.println("Nivel: " + nivel);
        // Los paréntesis hacen que primero se sume: 13 y no "121"
        System.out.println("Te faltan " + expParaSubir + " puntos para el nivel " + (nivel + 1));
        System.out.println("Vida después del golpe: " + vida);
        System.out.println("Monedas: " + monedas);
        System.out.println("Ataque crítico: " + ataqueCritico);
        System.out.println("Precisión: " + precision + "%");
        System.out.println("¿Tiene escudo? " + tieneEscudo);

        // Dato curioso: int / int corta los decimales
        System.out.println();
        System.out.println("7 / 2 = " + (7 / 2) + ", pero 7.0 / 2 = " + (7.0 / 2));
    }
}
