// Lección 7: Encapsulación, arreglos y cadenas
// Solución: un refugio con varias mascotas cuyos datos están protegidos.

class Mascota {
    // private: nadie fuera de esta clase puede tocar estos datos directamente
    private String nombre;
    private int energia;

    public Mascota(String nombre, int energia) {
        this.nombre = nombre;
        setEnergia(energia); // usamos el setter para validar desde el inicio
    }

    // Getter: permite LEER un dato
    public String getNombre() {
        return nombre;
    }

    public int getEnergia() {
        return energia;
    }

    // Setter: permite CAMBIAR un dato, pero con reglas (energía entre 0 y 100)
    public void setEnergia(int energia) {
        if (energia < 0) {
            this.energia = 0;
        } else if (energia > 100) {
            this.energia = 100;
        } else {
            this.energia = energia;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Un arreglo (array) guarda varios valores del mismo tipo
        Mascota[] refugio = new Mascota[3];
        refugio[0] = new Mascota("Toby", 80);
        refugio[1] = new Mascota("Luna", 150);  // el setter la deja en 100
        refugio[2] = new Mascota("Rocky", -20); // el setter la deja en 0

        // refugio[0].energia = 5000;  // ERROR: energia es private

        System.out.println("Mascotas en el refugio: " + refugio.length);

        // Recorremos el arreglo con un for: las posiciones van de 0 a length - 1
        for (int i = 0; i < refugio.length; i++) {
            Mascota m = refugio[i];
            String nombre = m.getNombre();
            System.out.println((i + 1) + ". " + nombre.toUpperCase()
                    + " (" + nombre.length() + " letras) - Energía: " + m.getEnergia());
        }

        // Cambiamos la energía de Rocky usando el setter
        refugio[2].setEnergia(refugio[2].getEnergia() + 60);
        System.out.println("Rocky comió. Ahora tiene " + refugio[2].getEnergia() + " de energía.");

        // Buscamos por nombre: los textos se comparan con equals, no con ==
        String buscado = "luna";
        for (int i = 0; i < refugio.length; i++) {
            if (refugio[i].getNombre().equalsIgnoreCase(buscado)) {
                System.out.println("Encontramos a " + refugio[i].getNombre() + " en la posición " + i + ".");
            }
        }
    }
}
