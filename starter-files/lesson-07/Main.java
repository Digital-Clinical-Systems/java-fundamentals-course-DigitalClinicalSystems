// Lección 7: Encapsulación, arreglos y cadenas
// PRÁCTICA: protege los datos de tus mascotas y arma un refugio.
//
// Pasos:
//   1. Completa getEnergia para que devuelva la energía.
//   2. Completa setEnergia para que la energía nunca baje de 0 ni pase de 100.
//   3. Agrega una tercera mascota al arreglo.
//   4. Escribe el for que recorre el refugio y muestra cada mascota.
//   5. Busca una mascota por nombre usando equalsIgnoreCase.
//
// Haz el TODO 3 antes del 4. Si ves NullPointerException, es porque una
// posición del arreglo todavía está vacía (vale null).
//
// Reto: muestra cuál es la mascota con MÁS energía del refugio.

class Mascota {
    private String nombre;
    private int energia;

    public Mascota(String nombre, int energia) {
        this.nombre = nombre;
        setEnergia(energia);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEnergia() {
        // TODO 1: devuelve la energía
        return 0;
    }

    public void setEnergia(int energia) {
        // TODO 2: si energia < 0 guarda 0; si energia > 100 guarda 100;
        //         si no, guarda el valor recibido (usa this.energia)
        this.energia = energia;
    }
}

public class Main {
    public static void main(String[] args) {
        Mascota[] refugio = new Mascota[3];
        refugio[0] = new Mascota("Toby", 80);
        refugio[1] = new Mascota("Luna", 150);
        // TODO 3: guarda una tercera mascota en la posición 2

        System.out.println("Mascotas en el refugio: " + refugio.length);

        // TODO 4: recorre el refugio con un for (i desde 0 hasta refugio.length - 1)
        //         y muestra: número, nombre en mayúsculas, cantidad de letras y energía
        //         Pista: nombre.toUpperCase() y nombre.length()

        // TODO 5: busca la mascota llamada "luna" con equalsIgnoreCase
        //         y muestra en qué posición está
        String buscado = "luna";
    }
}
