# Lección 4 · Guía de pantalla

**Tema**: Estructuras de control: decisiones y bucles
**Duración objetivo**: 10 minutos
**Editor**: [OnlineGDB – Java](https://www.onlinegdb.com/online_java_compiler)
**Código que se construye en el video**: `completed-examples/lesson-04/Main.java`

Esta guía dice **qué se ve** en cada escena del guion (`voice-script.md`). Las escenas tienen los mismos números y tiempos.

---

## Antes de grabar

- [ ] OnlineGDB en Java, letra a 20 px, zoom del navegador al 125 %.
- [ ] En el editor, dejar este punto de partida:

  ```java
  import java.util.Scanner;

  public class Main {
      public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);

          teclado.close();
      }
  }
  ```

- [ ] Ubicar el botón **Stop** de OnlineGDB (barra superior) para la demostración del bucle infinito.
- [ ] Respuestas que se usarán: edad `19` y `14`; nota `15` y `25`; tabla `7` y `13`.
- [ ] Sin nombres de autores, logos ni marcas en pantalla.

> Tip de edición: en cada **Run** el programa vuelve a preguntar todo desde la edad. Las respuestas que no importan para la escena se pueden acelerar a 2× en edición.

---

## Escena 1 · Gancho (0:00 – 0:30)

- **En pantalla**: repetición de 3 segundos del final de la lección 3: la consola con `Me faltan -1 años para cumplir 18.` y el círculo rojo.
- **Transición** a un fondo liso con dos íconos: 🔀 **Decidir** y 🔁 **Repetir**.
- **Texto en pantalla** (0:20): **"Hoy: 2 superpoderes"**

## Escena 2 · if y else: dos caminos (0:30 – 2:00)

- **En pantalla** (0:30 – 0:45): diagrama de flujo simple:

  ```
          ¿Llueve?
         /        \
       Sí          No
   Llevo casaca   No la llevo
  ```

- **Acciones en el editor**:
  ```java
  // ---------- Parte 1: if / else (dos caminos) ----------
  System.out.print("¿Cuántos años tienes? ");
  int edad = teclado.nextInt();

  if (edad >= 18) {
      System.out.println("Ya eres mayor de edad.");
  } else {
      System.out.println("Te faltan " + (18 - edad) + " años para cumplir 18.");
  }
  ```
- **Anotaciones**:
  - Recuadro sobre `(edad >= 18)` → **"condición: ¿verdadero o falso?"**
  - Sombrear el bloque entre las llaves del `if` en verde y el del `else` en naranja.
  - Flecha sobre la sangría (los espacios a la izquierda) → **"sangría = se ve qué va dentro"**.
- **Acciones**: **Run** con `19`, luego **Run** con `14`. Mostrar ambos resultados.
- **Texto en pantalla** (1:40): tabla de comparadores:

  | `>` | `<` | `>=` | `<=` | `==` | `!=` |
  |-----|-----|------|------|------|------|
  | mayor | menor | mayor o igual | menor o igual | igual | diferente |

  - **Anotación** extra: `=` (guarda) vs `==` (compara) en dos colores.

## Escena 3 · else if: varios caminos (2:00 – 4:00)

- **Acciones en el editor**:
  ```java
  // ---------- Parte 2: else if (varios caminos) ----------
  System.out.print("Ingresa tu nota (0 a 20): ");
  int nota = teclado.nextInt();

  // || significa "o": basta con que una de las dos sea verdad
  if (nota < 0 || nota > 20) {
      System.out.println("Esa nota no existe. Debe estar entre 0 y 20.");
  } else if (nota >= 18) {
      System.out.println("¡Logro destacado! Te luciste.");
  } else if (nota >= 14) {
      System.out.println("Muy bien, vas por buen camino.");
  } else if (nota >= 11) {
      System.out.println("Aprobaste. Con un poco más de práctica subes.");
  } else {
      System.out.println("Esta vez no salió, pero se puede recuperar.");
  }
  ```
- **Anotaciones**:
  - En `||`: globo **"|| = o"**. Al lado, en gris: **"&& = y"**.
  - Cuando se narra "Java revisa en orden": flecha que baja por cada condición con el valor `16`. En `>= 18` aparece ❌, en `>= 14` aparece ✅ y la flecha se detiene; las condiciones de abajo se ven en gris.
- **Acciones**: **Run** con nota `15`, luego **Run** con nota `25`.
- **Texto en pantalla**: **"Entra en la PRIMERA condición verdadera"**

## Escena 4 · for: repetir un número de veces (4:00 – 6:15)

- **En pantalla** (4:00 – 4:30): diez líneas de `println` escritas a mano (`7 x 1 = 7`, `7 x 2 = 14`…) que aparecen rápido y luego se tachan.
- **Acciones en el editor**:
  ```java
  // ---------- Parte 3: for (sabemos cuántas veces repetir) ----------
  System.out.print("¿Qué tabla de multiplicar quieres ver? ");
  int numero = teclado.nextInt();

  for (int i = 1; i <= 10; i++) {
      System.out.println(numero + " x " + i + " = " + (numero * i));
  }
  ```
- **Anotaciones**: separar las tres partes del `for` con colores y números:
  1. `int i = 1` → **"① empiezo en 1"**
  2. `i <= 10` → **"② sigo mientras i ≤ 10"**
  3. `i++` → **"③ al final de cada vuelta, i + 1"**
- **Animación opcional** (5:20): un contador `i = 1, 2, 3…` al lado del código que avanza mientras aparecen las líneas en la consola.
- **Acciones**: **Run** con tabla `7`. Luego **Run** con `13`.
- **Texto en pantalla**: **"for = sé CUÁNTAS veces"**

## Escena 5 · while: repetir mientras algo pase (6:15 – 8:30)

- **En pantalla** (6:15 – 6:35): ilustración genérica de unas zapatillas con etiqueta **S/ 250** y una alcancía con **+ S/ 30 por semana**.
- **Acciones en el editor**:
  ```java
  // ---------- Parte 4: while (repetimos MIENTRAS algo sea verdad) ----------
  int precioZapatillas = 250;
  int ahorroSemanal = 30;
  int ahorrado = 0;
  int semanas = 0;

  while (ahorrado < precioZapatillas) {
      ahorrado += ahorroSemanal;
      semanas++; // atajo de: semanas = semanas + 1
      System.out.println("Semana " + semanas + ": llevas S/ " + ahorrado);
  }

  System.out.println("¡Listo! En " + semanas + " semanas juntas para tus zapatillas.");
  ```
- **Acciones**: **Run**. Mostrar las 9 semanas en la consola.
  - **Anotación**: barra de progreso al lado de la consola que se llena hasta 250.
- **Demostración del bucle infinito** (7:45 – 8:30):
  1. Comentar la línea `ahorrado += ahorroSemanal;` poniendo `//` adelante.
  2. **Run**. La consola se llena sin parar de `Semana N: llevas S/ 0`.
  3. Presionar **Stop**.
  4. **Anotación**: círculo rojo sobre la línea comentada → **"nada cambia = nunca termina"**.
  5. Quitar el `//` y volver a presionar **Run** para que funcione bien.
- **Texto en pantalla**: **"while = sé HASTA CUÁNDO"**

## Escena 6 · ¿for o while? (8:30 – 9:10)

- **En pantalla**: diapositiva con dos columnas:

  | 🔁 `for` | 🔁 `while` |
  |---------|-----------|
  | Sé cuántas veces | Sé cuándo parar |
  | 10 multiplicaciones | Hasta juntar la plata |
  | 5 estudiantes | Hasta adivinar el número |
  | 20 niveles | Hasta escribir "salir" |

## Escena 7 · Te toca + cierre (9:10 – 10:00)

- **En pantalla**: tarjeta de pausa:
  > ⏸️ **PAUSA EL VIDEO**
  > Completa los 4 `TODO`: else · else if · for · while
  > Reto: ahorra S/ 45 por semana. ¿Cuántas semanas tardas?
  > Código de inicio en la descripción 👇
- Volver al editor mostrando el `main` completo, haciendo scroll de arriba hacia abajo para que se note lo largo que quedó.
- **Texto en pantalla final** (9:45): **"Siguiente: ordena tu código con métodos 🧩"**

---

## Código final en pantalla

Debe coincidir con [`completed-examples/lesson-04/Main.java`](../../completed-examples/lesson-04/Main.java).

---

## Descripción para YouTube

```
Lección 4 · Estructuras de control: decisiones y bucles

Enséñale a tu programa a decidir con if, else if y else, y a repetir con for y while. Clasifica tu nota, muestra cualquier tabla de multiplicar y calcula en cuántas semanas juntas para unas zapatillas.

▶ Practica aquí (gratis, sin registro):
OnlineGDB: https://www.onlinegdb.com/online_java_compiler
Código de inicio: https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/starter-files/lesson-04/Main.java
Solución: https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/completed-examples/lesson-04/Main.java

📂 Curso completo: https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems

Capítulos:
0:00 Dos superpoderes
0:30 if y else: dos caminos
2:00 else if: varios caminos
4:00 for: repetir un número de veces
6:15 while: repetir mientras algo pase
8:30 ¿for o while?
9:10 Te toca practicar

#JavaBeginners
```

---

## Checklist de publicación

- [ ] Audio sin ruido de fondo y a volumen parejo.
- [ ] Código, colores de las anotaciones y consola legibles en celular.
- [ ] Exportado en 1080p.
- [ ] Subido a YouTube como **No listado**.
- [ ] Enlace del video copiado en `course-plan.md` (Lección 4 → "Ver la lección").
