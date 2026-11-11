# Lección 7 · Guía de pantalla

**Tema**: Encapsulación, arreglos y cadenas
**Duración objetivo**: 8 minutos
**Editor**: [OnlineGDB – Java](https://www.onlinegdb.com/online_java_compiler)
**Código que se construye en el video**: `completed-examples/lesson-07/Main.java`

Esta guía dice **qué se ve** en cada escena del guion (`voice-script.md`). Las escenas tienen los mismos números y tiempos.

---

## Antes de grabar

- [ ] OnlineGDB en Java, letra a 20 px, zoom del navegador al 125 %.
- [ ] Punto de partida en el editor: una versión reducida de la clase de la lección 6, sin `private` todavía:

  ```java
  class Mascota {
      String nombre;
      int energia;

      Mascota(String nombre, int energia) {
          this.nombre = nombre;
          this.energia = energia;
      }
  }

  public class Main {
      public static void main(String[] args) {

      }
  }
  ```

- [ ] Sin nombres de autores, logos ni marcas en pantalla.

---

## Escena 1 · Gancho (0:00 – 0:30)

- **En pantalla**: repetición de 3 segundos del final de la lección 6 (`Energía: 5000` con círculo rojo).
- **Transición**: ilustración de un candado 🔒 que se cierra.
- **Texto en pantalla** (0:20): **"Hoy: 🔒 proteger · 📦 juntar · 🔍 buscar"**

## Escena 2 · Encapsulación: private (0:30 – 1:45)

- **En pantalla** (0:30 – 0:50): ilustración de un celular cerrado con una flecha que señala solo la entrada del cargador. Texto: **"Lo de adentro está protegido; usas la entrada que te dan"**.
- **Acciones**:
  1. Agregar `private` a los atributos y `public` al constructor:
     ```java
     // private: nadie fuera de esta clase puede tocar estos datos directamente
     private String nombre;
     private int energia;

     public Mascota(String nombre, int energia) {
     ```
  2. En el `main`, escribir:
     ```java
     Mascota[] refugio = new Mascota[3];
     refugio[0] = new Mascota("Toby", 80);
     refugio[0].energia = 5000;
     ```
     (El arreglo se explica en la escena 4; aquí solo se usa para la demostración.)
  3. **Run**. Zoom al error: `error: energia has private access in Mascota`.
     - **Anotación**: subrayar `private access` con el texto **"🔒 no se puede tocar desde afuera"**.
  4. Convertir la línea en comentario:
     ```java
     // refugio[0].energia = 5000;  // ERROR: energia es private
     ```

## Escena 3 · Getters y setters (1:45 – 3:15)

- **Acciones**: dentro de `Mascota`, debajo del constructor:
  ```java
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
  ```
- Luego, en el constructor, cambiar `this.energia = energia;` por:
  ```java
  setEnergia(energia); // usamos el setter para validar desde el inicio
  ```
- **Anotaciones**:
  - Etiqueta 👁️ **"get = leer"** sobre los getters y ✏️ **"set = cambiar con reglas"** sobre el setter.
  - Ilustración pequeña de un portero 🧍 junto al `if` del setter con el texto **"revisa antes de dejar pasar"**.
  - Diagrama al costado:

    ```
    main  ──X──▶  energia (private)
    main  ──▶ getEnergia() ──▶ energia   (leer)
    main  ──▶ setEnergia() ──▶ ✅ reglas ──▶ energia   (cambiar)
    ```

## Escena 4 · Arreglos: varias mascotas juntas (3:15 – 5:00)

- **En pantalla** (3:15 – 3:40): diagrama de una fila de 3 cajas con números de posición debajo:

  ```
   ┌──────┐┌──────┐┌──────┐
   │ Toby ││ Luna ││Rocky │
   └──────┘└──────┘└──────┘
      0       1       2
  ```

  - **Anotación**: el `0` parpadea en rojo con el texto **"¡Se empieza a contar desde 0!"**.
- **Acciones** en el `main` (debajo de lo que ya hay):
  ```java
  refugio[1] = new Mascota("Luna", 150);  // el setter la deja en 100
  refugio[2] = new Mascota("Rocky", -20); // el setter la deja en 0
  ```
  Y agregar el comentario arriba de `Mascota[] refugio`:
  ```java
  // Un arreglo (array) guarda varios valores del mismo tipo
  ```
  - **Anotaciones**: en `Mascota[]` resaltar `[]` → **"varias"**; en `new Mascota[3]` resaltar `3` → **"3 cajas"**.
- **Acciones**: escribir el recorrido (primera versión, sin métodos de `String`):
  ```java
  System.out.println("Mascotas en el refugio: " + refugio.length);

  // Recorremos el arreglo con un for: las posiciones van de 0 a length - 1
  for (int i = 0; i < refugio.length; i++) {
      Mascota m = refugio[i];
      String nombre = m.getNombre();
      System.out.println((i + 1) + ". " + nombre + " - Energía: " + m.getEnergia());
  }
  ```
  - **Anotación**: en `refugio.length` → **"cuántas cajas hay"**.

## Escena 5 · Cadenas: jugando con textos (5:00 – 6:15)

- **Acciones**:
  1. Modificar el `println` del `for`:
     ```java
     System.out.println((i + 1) + ". " + nombre.toUpperCase()
             + " (" + nombre.length() + " letras) - Energía: " + m.getEnergia());
     ```
     - **Anotaciones**: `toUpperCase()` → **"MAYÚSCULAS"**; `length()` → **"cuántas letras"**. Nota pequeña: **"en arreglos: `length` sin paréntesis · en textos: `length()` con paréntesis"**.
  2. **Run**. Zoom a:
     ```
     Mascotas en el refugio: 3
     1. TOBY (4 letras) - Energía: 80
     2. LUNA (4 letras) - Energía: 100
     3. ROCKY (5 letras) - Energía: 0
     ```
     - **Anotación**: flechas en `100` y `0` → **"¡el setter corrigió 150 y -20!"**.
  3. Agregar:
     ```java
     // Cambiamos la energía de Rocky usando el setter
     refugio[2].setEnergia(refugio[2].getEnergia() + 60);
     System.out.println("Rocky comió. Ahora tiene " + refugio[2].getEnergia() + " de energía.");
     ```
  4. **Run**.

## Escena 6 · Buscar por nombre: equals (6:15 – 7:15)

- **Acciones**:
  ```java
  // Buscamos por nombre: los textos se comparan con equals, no con ==
  String buscado = "luna";
  for (int i = 0; i < refugio.length; i++) {
      if (refugio[i].getNombre().equalsIgnoreCase(buscado)) {
          System.out.println("Encontramos a " + refugio[i].getNombre() + " en la posición " + i + ".");
      }
  }
  ```
- **Texto en pantalla** (6:35): tabla de comparación:

  | Comparar… | Usa |
  |-----------|-----|
  | Números | `==` |
  | Textos | `.equals(...)` |
  | Textos sin importar mayúsculas | `.equalsIgnoreCase(...)` |

  - **Anotación**: `==` con textos tachado en rojo.
- **Run**. Zoom a `Encontramos a Luna en la posición 1.`
  - **Anotación**: señalar el `1` y mostrar de nuevo el diagrama de cajas con Luna en la posición 1.

## Escena 7 · Te toca + cierre (7:15 – 8:00)

- **En pantalla**: tarjeta de pausa:
  > ⏸️ **PAUSA EL VIDEO**
  > Completa el getter y el setter
  > Agrega una 3.ª mascota al refugio
  > Recórrelo con `for` y busca a "luna"
  > Reto: ¿cuál tiene MÁS energía?
  > Código de inicio en la descripción 👇
- **En pantalla** (7:35): checklist animado con todo lo aprendido: ✅ variables ✅ decisiones ✅ bucles ✅ métodos ✅ clases y objetos ✅ arreglos.
- **Texto en pantalla final** (7:45): **"Siguiente: Proyecto final · Registro de estudiantes 🎓"**

---

## Código final en pantalla

Debe coincidir con [`completed-examples/lesson-07/Main.java`](../../completed-examples/lesson-07/Main.java).

---

## Descripción para YouTube

```
Lección 7 · Encapsulación, arreglos y cadenas

Protege los datos de tus objetos con private, getters y setters. Guarda varias mascotas en un arreglo (array), recórrelo con for, usa métodos de String y aprende por qué los textos se comparan con equals.

▶ Practica aquí (gratis, sin registro):
OnlineGDB: https://www.onlinegdb.com/online_java_compiler
Código de inicio: https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/starter-files/lesson-07/Main.java
Solución: https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/completed-examples/lesson-07/Main.java

📂 Curso completo: https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems

Capítulos:
0:00 Vida infinita: el problema
0:30 Encapsulación: private
1:45 Getters y setters
3:15 Arreglos: varias mascotas juntas
5:00 Cadenas: jugando con textos
6:15 Buscar por nombre: equals
7:15 Te toca practicar

#JavaBeginners
```

---

## Checklist de publicación

- [ ] Audio sin ruido de fondo y a volumen parejo.
- [ ] Código y consola legibles en celular (usar zoom en el setter y en el `for`).
- [ ] Exportado en 1080p.
- [ ] Subido a YouTube como **No listado**.
- [ ] Enlace del video copiado en `course-plan.md` (Lección 7 → "Ver la lección").
