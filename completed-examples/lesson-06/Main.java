// Lección 6: Introducción a la POO: clases, objetos y constructores
// Solución: una mascota virtual. La clase es el molde; cada objeto es una mascota.

class Mascota {
    // Atributos: lo que la mascota TIENE
    String nombre;
    String especie;
    int energia;
    int felicidad;

    // Constructor: se ejecuta cuando hacemos new Mascota(...)
    Mascota(String nombre, String especie) {
        this.nombre = nombre;   // this.nombre es el atributo; nombre es el parámetro
        this.especie = especie;
        this.energia = 50;      // todas las mascotas empiezan con 50
        this.felicidad = 50;
    }

    // Métodos: lo que la mascota HACE (sin static, porque cada mascota tiene los suyos)
    void comer() {
        energia += 20;
        System.out.println(nombre + " comió. ¡Ñam!");
    }

    void jugar() {
        energia -= 15;
        felicidad += 25;
        System.out.println(nombre + " jugó contigo y está feliz.");
    }

    void mostrarEstado() {
        System.out.println("[" + especie + "] " + nombre
                + " | Energía: " + energia + " | Felicidad: " + felicidad);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creamos dos objetos con el mismo molde
        Mascota mascota1 = new Mascota("Toby", "Perro");
        Mascota mascota2 = new Mascota("Luna", "Gata");

        mascota1.mostrarEstado();
        mascota2.mostrarEstado();
        System.out.println();

        // Cada objeto usa sus propios métodos
        mascota1.jugar();
        mascota1.comer();
        mascota2.comer();
        System.out.println();

        // Cada objeto guarda sus propios datos
        mascota1.mostrarEstado();
        mascota2.mostrarEstado();
    }
}
