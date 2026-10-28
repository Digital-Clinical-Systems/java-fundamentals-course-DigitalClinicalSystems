// Lección 6: Introducción a la POO: clases, objetos y constructores
// PRÁCTICA: crea tu propia mascota virtual.
//
// Pasos:
//   1. Completa el constructor para que guarde el nombre y la especie con this.
//   2. Completa el método jugar: resta 15 de energía y suma 25 de felicidad.
//   3. Completa mostrarEstado para que muestre especie, nombre, energía y felicidad.
//   4. En main, crea una segunda mascota y haz que coma y juegue.
//
// Si en la consola ves "null jugó contigo", es que falta el TODO 1:
// null significa que el atributo nombre todavía no tiene ningún valor.
//
// Reto: agrega un método dormir() que suba la energía en 40.

class Mascota {
    String nombre;
    String especie;
    int energia;
    int felicidad;

    Mascota(String nombre, String especie) {
        // TODO 1: guarda el nombre y la especie en los atributos usando this
        this.energia = 50;
        this.felicidad = 50;
    }

    void comer() {
        energia += 20;
        System.out.println(nombre + " comió. ¡Ñam!");
    }

    void jugar() {
        // TODO 2: resta 15 a energia y suma 25 a felicidad
        System.out.println(nombre + " jugó contigo y está feliz.");
    }

    void mostrarEstado() {
        // TODO 3: muestra "[especie] nombre | Energía: X | Felicidad: Y"
    }
}

public class Main {
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota("Toby", "Perro");
        mascota1.mostrarEstado();

        mascota1.jugar();
        mascota1.comer();
        mascota1.mostrarEstado();

        // TODO 4: crea una segunda mascota con new, haz que coma y juegue,
        //         y muestra su estado
    }
}
