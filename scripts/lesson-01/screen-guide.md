# Lección 1 · Guía de pantalla

**Tema**: ¿Qué es programar? Tu primer programa en Java
**Duración objetivo**: 5 minutos
**Editor**: [OnlineGDB – Java](https://www.onlinegdb.com/online_java_compiler)
**Código que se construye en el video**: `completed-examples/lesson-01/Main.java`

Esta guía dice **qué se ve** en cada escena del guion (`voice-script.md`). Las escenas tienen los mismos números y tiempos.

---

## Antes de grabar

- [ ] Ventana del navegador a 1920×1080, sin barra de favoritos ni otras pestañas visibles.
- [ ] OnlineGDB abierto en Java, con el código de ejemplo que trae por defecto (`Hello World`).
- [ ] Letra del editor en 20 px: ícono de engranaje ⚙️ (**Settings**) → **Font Size**.
- [ ] Borrar el bloque de comentarios grande que OnlineGDB trae arriba del código, para que solo quede `public class Main`.
- [ ] Zoom del navegador al 125 % para que la consola también se lea en celular.
- [ ] Sin nombres de autores, logos ni marcas en pantalla.

---

## Escena 1 · Gancho (0:00 – 0:25)

- **En pantalla**: animación simple con íconos genéricos de apps (chat, video, control de juego) apareciendo uno por uno sobre fondo liso. No usar logos reales.
- **Texto en pantalla** (centrado, aparece en 0:15): **"Hoy escribes tu primer programa"**
- **Abajo, pequeño**: "Sin instalar nada · Solo tu navegador"

## Escena 2 · ¿Qué es programar? (0:25 – 1:20)

- **En pantalla**: diapositiva con un dibujo sencillo de un robot y un pan.
- **Acción**: a medida que se narra, aparecen los pasos uno por uno como lista numerada:
  1. Agarra el pan
  2. Ábrelo
  3. Corta la palta
  4. Ponla encima
- **Anotación**: cuando el narrador dice "si te saltas un paso", el paso 3 se tacha en rojo y el robot muestra un signo de interrogación.
- **Texto en pantalla** (0:55): **"Programa = instrucciones en orden, de arriba hacia abajo"** con una flecha vertical hacia abajo.
- **Cierre de escena**: aparecen tres etiquetas de lenguajes en texto plano: `Python`, `JavaScript`, `Java` (esta última resaltada).

## Escena 3 · ¿Por qué Java? (1:20 – 1:50)

- **En pantalla**: tres tarjetas con ícono genérico + texto:
  - 🎮 "Videojuegos (Minecraft: Java Edition)"
  - 📱 "Apps de Android"
  - 🏦 "Sistemas de bancos y tiendas"
- **Texto en pantalla** (1:40): **"Java = ordenado y claro"**

## Escena 4 · Abrimos el editor (1:50 – 2:30)

- **En pantalla**: grabación del navegador.
- **Acciones**:
  1. Escribir `onlinegdb.com/online_java_compiler` en la barra de direcciones y presionar Enter.
  2. Mover el cursor al menú **Language** (arriba a la derecha) y mostrar que dice **Java**. No cambiar nada.
- **Anotaciones**:
  - Recuadro amarillo sobre el área del código con la etiqueta **"Aquí escribes"**.
  - Recuadro amarillo sobre la consola (parte de abajo, aparece al ejecutar) con la etiqueta **"Aquí ves el resultado"**.
- **Texto en pantalla**: "Gratis · Sin cuenta · Sin instalar"

## Escena 5 · Las partes del programa (2:30 – 3:20)

- **En pantalla**: el código por defecto:

  ```java
  public class Main
  {
      public static void main(String[] args) {
          System.out.println("Hello World");
      }
  }
  ```

- **Acciones y anotaciones** (resaltar cada línea cuando se nombre):
  1. Línea `public class Main` → resaltado azul + globo **"La carpeta de tu programa"**.
  2. Línea `public static void main(String[] args)` → resaltado verde + globo **"La puerta de entrada: aquí empieza todo"**.
  3. Línea `System.out.println("Hello World");` → resaltado naranja + globo **"Muestra texto en la consola"**. Luego un círculo rojo sobre el `;` con el texto **"punto final"**.
  4. Cambiar `"Hello World"` por `"¡Hola, mundo!"`.
  5. Presionar **Run** (botón verde arriba). Esperar a que la consola muestre `¡Hola, mundo!`.
- **Texto en pantalla** al ver el resultado: **"¡Tu programa habló!"**

## Escena 6 · Tu tarjeta de presentación (3:20 – 4:20)

- **Acciones** (escribir a velocidad normal; se puede acelerar a 1.5× en edición):
  1. Reemplazar la línea del "Hola, mundo" por el encabezado de la tarjeta:
     ```java
     System.out.println("==============================");
     System.out.println("  MI TARJETA DE PRESENTACIÓN");
     System.out.println("==============================");
     ```
  2. Agregar debajo:
     ```java
     System.out.println("Nombre: Valeria");
     System.out.println("Colegio: 3.° de secundaria");
     System.out.println("Me gusta: dibujar y el vóley");
     ```
  3. **Run**. Mostrar la consola. **Anotación**: flechas que unen cada `println` con su línea en la consola.
  4. Agregar:
     ```java
     System.out.print("Mi frase: ");
     System.out.println("Hoy aprendo algo nuevo.");
     System.out.println("==============================");
     ```
  5. **Run**. **Anotación**: resaltar `print` vs `println` con dos colores y el texto **"print = sigue en la misma línea"**.
  6. Escribir encima del bloque de datos el comentario:
     ```java
     // println muestra un texto y luego salta a la siguiente línea
     ```
     **Texto en pantalla**: **"// = comentario. Java lo ignora"**
  7. **Error a propósito**: borrar el `;` de la línea `"Nombre: Valeria"` y presionar **Run**.
     - Hacer zoom a la consola donde aparece `error: ';' expected` y el número de línea.
     - **Anotación**: subrayar el número de línea y el texto `';' expected`.
     - **Texto en pantalla**: **"Los errores te dicen DÓNDE y QUÉ"**
  8. Volver a poner el `;` y presionar **Run** para que funcione otra vez.

## Escena 7 · Te toca + cierre (4:20 – 5:00)

- **En pantalla**: tarjeta de pausa a pantalla completa:
  > ⏸️ **PAUSA EL VIDEO**
  > Arma tu tarjeta: nombre · grado · algo que te guste · tu frase
  > Código de inicio en la descripción 👇
- Mantener la tarjeta 5 segundos y luego volver al editor con el programa terminado y la consola visible.
- **Texto en pantalla final** (4:45): **"Siguiente: Variables · El perfil de tu personaje 🎮"**

---

## Código final en pantalla

Debe coincidir con [`completed-examples/lesson-01/Main.java`](../../completed-examples/lesson-01/Main.java).

---

## Descripción para YouTube

```
Lección 1 · ¿Qué es programar? Tu primer programa en Java

Aprende qué es programar, dónde se usa Java y escribe tu primer programa: una tarjeta de presentación en la consola. No necesitas instalar nada.

▶ Practica aquí (gratis, sin registro):
OnlineGDB: https://www.onlinegdb.com/online_java_compiler
Código de inicio: https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/starter-files/lesson-01/Main.java
Solución: https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/completed-examples/lesson-01/Main.java

📂 Curso completo: https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems

Capítulos:
0:00 ¿Cuántas apps usaste hoy?
0:25 ¿Qué es programar?
1:20 ¿Por qué Java?
1:50 Abrimos el editor online
2:30 Las partes de un programa
3:20 Tu tarjeta de presentación
4:20 Te toca practicar

#JavaBeginners
```

---

## Checklist de publicación

- [ ] Audio sin ruido de fondo y a volumen parejo.
- [ ] Todo el código y la consola se leen bien en la pantalla de un celular.
- [ ] Exportado en 1080p.
- [ ] Subido a YouTube como **No listado**.
- [ ] Enlace del video copiado en `course-plan.md` (Lección 1 → "Ver la lección").
