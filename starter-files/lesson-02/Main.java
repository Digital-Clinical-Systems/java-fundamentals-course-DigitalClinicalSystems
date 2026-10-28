// Lección 2: Variables, tipos de datos y operadores
// PRÁCTICA: crea el perfil de TU personaje de videojuego.
//
// Pasos:
//   1. Cambia los valores de las variables por los de tu personaje.
//   2. Completa los cálculos marcados con TODO usando  /  %  -  +=  *
//   3. Presiona Run y revisa que los números tengan sentido.
//
// Reto: pon 1999 de experiencia. ¿Qué nivel te sale? ¿Por qué no sale 20?

public class Main {
    public static void main(String[] args) {
        // TODO 1: cambia estos valores por los de tu personaje
        String nombreJugador = "MiPersonaje";
        char rango = 'C';
        int experiencia = 800;
        double precision = 50.0;
        boolean tieneEscudo = false;

        // Cada nivel son 100 puntos de experiencia
        // TODO 2: calcula el nivel dividiendo la experiencia entre 100
        int nivel = 0;

        // TODO 3: calcula los puntos que sobran usando %
        int expSobrante = 0;

        int expParaSubir = 100 - expSobrante;

        int vida = 100;
        int golpe = 35;
        // TODO 4: resta el golpe a la vida (vida = vida - golpe;)

        int monedas = 40;
        // TODO 5: suma 25 monedas usando el atajo +=

        int ataque = 18;
        // TODO 6: el ataque crítico es el doble del ataque (usa *)
        int ataqueCritico = 0;

        System.out.println("=== PERFIL DEL JUGADOR ===");
        System.out.println("Jugador: " + nombreJugador + " (rango " + rango + ")");
        System.out.println("Nivel: " + nivel);
        System.out.println("Te faltan " + expParaSubir + " puntos para el nivel " + (nivel + 1));
        System.out.println("Vida después del golpe: " + vida);
        System.out.println("Monedas: " + monedas);
        System.out.println("Ataque crítico: " + ataqueCritico);
        System.out.println("Precisión: " + precision + "%");
        System.out.println("¿Tiene escudo? " + tieneEscudo);
    }
}
