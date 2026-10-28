# Lección 3 · Guía de pantalla

**Tema**: Entrada y salida: tu programa te pregunta
**Duración objetivo**: 6 minutos
**Editor**: [OnlineGDB – Java](https://www.onlinegdb.com/online_java_compiler)
**Código que se construye en el video**: `completed-examples/lesson-03/Main.java`

Esta guía dice **qué se ve** en cada escena del guion (`voice-script.md`). Las escenas tienen los mismos números y tiempos.

---

## Antes de grabar

- [ ] OnlineGDB en Java, letra a 20 px, zoom del navegador al 125 %.
- [ ] En el editor, dejar solo la clase `Main` con un `main` vacío (sin el comentario grande de OnlineGDB).
- [ ] Probar una vez que la consola acepta lo que escribes: en OnlineGDB hay que **hacer clic dentro de la consola** antes de escribir.
- [ ] Respuestas que se usarán en la grabación: `Mateo` · `jugar fútbol` · `14`.
- [ ] Sin nombres de autores, logos ni marcas en pantalla.

---

## Escena 1 · Gancho (0:00 – 0:25)

- **En pantalla**: ilustración genérica de un formulario de perfil de una app (campos "Nombre", "Edad", "Pasatiempo") que se va llenando solo.
- **Texto en pantalla** (0:15): **"Hoy tu programa te escucha 👂"**

## Escena 2 · Entrada y salida (0:25 – 1:00)

- **En pantalla**: diagrama de tres cajas en fila:

  ```
  [ ⌨️ Teclado ]  →  [ Programa ]  →  [ 🖥️ Consola ]
     ENTRADA                            SALIDA
  ```

- **Anotación**: cuando se dice "salida", se ilumina la flecha derecha con la etiqueta `println`; cuando se dice "entrada", se ilumina la izquierda con la etiqueta `Scanner`.

## Escena 3 · Preparamos el Scanner (1:00 – 2:00)

- **Acciones**:
  1. Escribir la primera línea del archivo, **encima** de `public class Main`:
     ```java
     import java.util.Scanner; // traemos Scanner desde la biblioteca de Java
     ```
     **Anotación**: flecha que señala que va **antes** de la clase. Texto: **"import = tráeme esta herramienta"**.
  2. Dentro del `main`, escribir:
     ```java
     // Creamos un Scanner que "escucha" lo que escribes en el teclado
     Scanner teclado = new Scanner(System.in);
     ```
     **Anotación**: dividir la línea en tres globos de colores:
     - `Scanner teclado` → **"un Scanner llamado teclado"**
     - `new Scanner(...)` → **"créalo nuevo"**
     - `System.in` → **"que lea del teclado"**

## Escena 4 · Hacemos preguntas (2:00 – 3:30)

- **Acciones**: escribir bloque por bloque:

  ```java
  // print deja el cursor en la misma línea, así respondes al costado
  System.out.print("¿Cómo te llamas? ");
  String nombre = teclado.nextLine();      // nextLine lee una línea de texto

  System.out.print("¿Cuál es tu pasatiempo favorito? ");
  String pasatiempo = teclado.nextLine();

  System.out.print("¿Cuántos años tienes? ");
  int edad = teclado.nextInt();            // nextInt lee un número entero

  int aniosParaLos18 = 18 - edad;
  ```

- **Anotaciones**:
  - Resaltar el espacio después del `?` en `"¿Cómo te llamas? "` con el texto **"deja un espacio para la respuesta"**.
  - Recuadro verde en `nextLine()` → **"texto"**. Recuadro azul en `nextInt()` → **"número entero"**.
- **Texto en pantalla** (3:20): mini tabla en una esquina:

  | Quiero leer… | Uso |
  |--------------|-----|
  | Texto | `teclado.nextLine()` |
  | Entero | `teclado.nextInt()` |

## Escena 5 · Armamos la página (3:30 – 4:30)

- **Acciones**:
  1. Escribir la salida:
     ```java
     // Salida: usamos las respuestas para armar la página
     System.out.println();
     System.out.println("********** MI PÁGINA **********");
     System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
     System.out.println("En mi tiempo libre me encanta: " + pasatiempo + ".");
     System.out.println("Me faltan " + aniosParaLos18 + " años para cumplir 18.");
     System.out.println("Gracias por visitar mi página.");
     System.out.println("*******************************");

     teclado.close(); // cerramos el Scanner cuando ya no lo usamos
     ```
  2. Presionar **Run**. Mostrar que la consola se queda esperando con `¿Cómo te llamas?`.
     **Anotación**: cursor parpadeando resaltado con el texto **"esperando tu respuesta…"**.
  3. Hacer clic en la consola y escribir `Mateo` + Enter, `jugar fútbol` + Enter, `14` + Enter.
  4. Zoom a la página que aparece. Mantenerla 3 segundos.
- **Texto en pantalla**: **"Mismo código, distinta persona = distinta página"**

## Escena 6 · ¿Y si pongo letras? (4:30 – 5:15)

- **Acciones**:
  1. **Run** de nuevo. Responder `Mateo`, `jugar fútbol` y en la edad escribir `catorce`.
  2. Zoom al error en la consola: `Exception in thread "main" java.util.InputMismatchException`.
- **Anotaciones**:
  - Subrayar `InputMismatchException`.
  - Globo con la traducción: **"Esperaba un número y recibió otra cosa"**.

## Escena 7 · Te toca + cierre (5:15 – 6:00)

- **En pantalla**: tarjeta de pausa:
  > ⏸️ **PAUSA EL VIDEO**
  > Completa las preguntas que faltan en el código de inicio
  > Reto: agrega una pregunta más (tu comida favorita)
  > Código de inicio en la descripción 👇
- **Acción después de la pausa**: **Run** respondiendo `Mateo`, `jugar fútbol` y `19`.
  - Zoom a la línea `Me faltan -1 años para cumplir 18.`
  - **Anotación**: círculo rojo en `-1` y un signo de interrogación.
- **Texto en pantalla final** (5:45): **"Siguiente: tu programa toma decisiones · if / else 🔀"**

---

## Código final en pantalla

Debe coincidir con [`completed-examples/lesson-03/Main.java`](../../completed-examples/lesson-03/Main.java).

---

## Descripción para YouTube

```
Lección 3 · Entrada y salida: tu programa te pregunta

Usa Scanner para que tu programa te haga preguntas y arme tu página personal con tus respuestas. Aprende la diferencia entre nextLine y nextInt.

▶ Practica aquí (gratis, sin registro):
OnlineGDB: https://www.onlinegdb.com/online_java_compiler
Código de inicio: https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/starter-files/lesson-03/Main.java
Solución: https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/completed-examples/lesson-03/Main.java
Tip: en OnlineGDB haz clic en la consola antes de escribir tu respuesta.

📂 Curso completo: https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems

Capítulos:
0:00 Tu programa te escucha
0:25 Entrada y salida
1:00 Preparamos el Scanner
2:00 Hacemos preguntas
3:30 Armamos la página
4:30 ¿Y si pongo letras?
5:15 Te toca practicar

#JavaBeginners
```

---

## Checklist de publicación

- [ ] Audio sin ruido de fondo y a volumen parejo.
- [ ] Lo que se escribe en la consola se lee bien en celular.
- [ ] Exportado en 1080p.
- [ ] Subido a YouTube como **No listado**.
- [ ] Enlace del video copiado en `course-plan.md` (Lección 3 → "Ver la lección").
