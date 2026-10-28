# Lección 6 · Guía de pantalla

**Tema**: Introducción a la POO: clases, objetos y constructores
**Duración objetivo**: 8 minutos
**Editor**: [OnlineGDB – Java](https://www.onlinegdb.com/online_java_compiler)
**Código que se construye en el video**: `completed-examples/lesson-06/Main.java`

Esta guía dice **qué se ve** en cada escena del guion (`voice-script.md`). Las escenas tienen los mismos números y tiempos.

---

## Antes de grabar

- [ ] OnlineGDB en Java, letra a 20 px, zoom del navegador al 125 %.
- [ ] En el editor, dejar la clase `Main` con un `main` vacío y **varias líneas en blanco arriba**, porque la clase `Mascota` se escribe encima de `Main`.
- [ ] Preparar dos ilustraciones genéricas: un perro y una gata estilo caricatura (sin personajes conocidos).
- [ ] Sin nombres de autores, logos ni marcas en pantalla.

> Nota técnica: en un editor online todo va en un solo archivo `Main.java`. Solo la clase `Main` lleva `public`; la clase `Mascota` va sin `public`.

---

## Escena 1 · Gancho (0:00 – 0:30)

- **En pantalla**: ilustración de una mascota virtual en una pantallita, con dos barras: ⚡ energía y 😊 felicidad.
- **Texto en pantalla** (0:20): **"Programación Orientada a Objetos (POO)"**

## Escena 2 · Pensar en objetos (0:30 – 1:30)

- **En pantalla**: dibujo de un perro con dos listas a los lados:

  | Lo que TIENE | Lo que HACE |
  |--------------|-------------|
  | nombre | come |
  | edad | ladra |
  | color | juega |

- **Anotación** (1:15): sobre la columna izquierda aparece la etiqueta **"atributos"**; sobre la derecha, **"métodos"**.

## Escena 3 · Clase y objeto (1:30 – 2:30)

- **En pantalla**: un molde de galletas con forma de estrella etiquetado **CLASE**. Al narrar, salen del molde tres galletas distintas (una con chispas, una más tostada, una normal), cada una etiquetada **OBJETO**.
- **Transición**: el molde cambia su etiqueta a `Mascota` y las galletas se convierten en tarjetas: `Toby 🐶`, `Luna 🐱`.
- **Texto en pantalla** (2:15): **"Clase = molde · Objeto = lo que fabricas con el molde"**

## Escena 4 · Creamos la clase Mascota (2:30 – 3:30)

- **Acciones**: escribir **encima** de `public class Main`:
  ```java
  class Mascota {
      // Atributos: lo que la mascota TIENE
      String nombre;
      String especie;
      int energia;
      int felicidad;
  }
  ```
- **Anotaciones**:
  - Llave grande al lado de los cuatro atributos → **"atributos"**.
  - Globo **"sin valores: es solo el molde"**.

## Escena 5 · El constructor (3:30 – 4:45)

- **Acciones**: dentro de `Mascota`, debajo de los atributos:
  ```java
  // Constructor: se ejecuta cuando hacemos new Mascota(...)
  Mascota(String nombre, String especie) {
      this.nombre = nombre;   // this.nombre es el atributo; nombre es el parámetro
      this.especie = especie;
      this.energia = 50;      // todas las mascotas empiezan con 50
      this.felicidad = 50;
  }
  ```
- **Anotaciones**:
  - Resaltar `Mascota(` del constructor y `class Mascota` con el mismo color → **"mismo nombre que la clase"**.
  - Globo **"sin void, sin tipo de retorno"**.
  - En `this.nombre = nombre;`: `this.nombre` en azul con la etiqueta **"de ESTA mascota"**; `nombre` en verde con la etiqueta **"lo que me mandaron"**; flecha verde → azul.

## Escena 6 · Lo que la mascota hace (4:45 – 5:45)

- **Acciones**: dentro de `Mascota`, debajo del constructor:
  ```java
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
  ```
- **Anotación**: comparar en pantalla dividida:
  - Izquierda (lección 5): `public static void saludar(...)` con `static` resaltado.
  - Derecha (hoy): `void comer()` con un espacio vacío donde iría `static`.
  - Texto: **"sin static = cada objeto tiene el suyo"**.

## Escena 7 · Damos vida a las mascotas (5:45 – 7:15)

- **Acciones**: dentro del `main`:
  ```java
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
  ```
- **Anotaciones**:
  - Círculo sobre `new` → **"¡fabrica el objeto!"**
  - Flecha desde `"Toby", "Perro"` hasta los parámetros del constructor.
  - Círculo sobre el **punto** de `mascota1.jugar()` → **"el punto = 'oye, Toby…'"**.
- **Run**. Zoom a la consola:
  ```
  [Perro] Toby | Energía: 50 | Felicidad: 50
  [Gata] Luna | Energía: 50 | Felicidad: 50

  Toby jugó contigo y está feliz.
  Toby comió. ¡Ñam!
  Luna comió. ¡Ñam!

  [Perro] Toby | Energía: 55 | Felicidad: 75
  [Gata] Luna | Energía: 70 | Felicidad: 50
  ```
- **Animación** (6:50): las ilustraciones de Toby y Luna, cada una con sus barras de energía y felicidad, cambian según la consola. Luna mantiene su felicidad en 50.
- **Texto en pantalla**: **"Cada objeto guarda SUS propios datos"**

## Escena 8 · Te toca + cierre (7:15 – 8:00)

- **En pantalla**: tarjeta de pausa:
  > ⏸️ **PAUSA EL VIDEO**
  > Completa el constructor, `jugar()` y `mostrarEstado()`
  > Crea tu propia mascota con `new`
  > ¿Ves "null"? Te falta el constructor
  > Reto: agrega `dormir()` (+40 de energía)
  > Código de inicio en la descripción 👇
- **Acción después de la pausa** (7:35): escribir en el `main` `mascota1.energia = 5000;`, luego `mascota1.mostrarEstado();` y presionar **Run**. Mostrar `Energía: 5000`.
  - **Anotación**: círculo rojo y signo de interrogación. Luego borrar esas dos líneas.
- **Texto en pantalla final** (7:45): **"Siguiente: protege tus datos y arma un refugio 🔒"**

---

## Código final en pantalla

Debe coincidir con [`completed-examples/lesson-06/Main.java`](../../completed-examples/lesson-06/Main.java).

---

## Descripción para YouTube

```
Lección 6 · Introducción a la POO: clases, objetos y constructores

Empieza con la Programación Orientada a Objetos creando una mascota virtual. Aprende la diferencia entre clase (el molde) y objeto, qué son los atributos, cómo funciona el constructor con this y cómo crear objetos con new.

▶ Practica aquí (gratis, sin registro):
OnlineGDB: https://www.onlinegdb.com/online_java_compiler
Código de inicio: https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/starter-files/lesson-06/Main.java
Solución: https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/completed-examples/lesson-06/Main.java

📂 Curso completo: https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems

Capítulos:
0:00 Tu mascota virtual
0:30 Pensar en objetos
1:30 Clase y objeto
2:30 Creamos la clase Mascota
3:30 El constructor
4:45 Lo que la mascota hace
5:45 Damos vida a las mascotas
7:15 Te toca practicar

#JavaBeginners
```

---

## Checklist de publicación

- [ ] Audio sin ruido de fondo y a volumen parejo.
- [ ] Código y consola legibles en celular (el archivo es más largo: usar zoom en las partes que se explican).
- [ ] Exportado en 1080p.
- [ ] Subido a YouTube como **No listado**.
- [ ] Enlace del video copiado en `course-plan.md` (Lección 6 → "Ver la lección").
